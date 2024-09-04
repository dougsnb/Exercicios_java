import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String USERS_FILE = "users.data";
    private static final String EVENTS_FILE = "events.data";
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private static List<User> users = new ArrayList<>();
    private static List<Event> events = new ArrayList<>();
    private static User loggedInUser = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadUsersFromFile();
        loadEventsFromFile();

        while (true) {
            System.out.println("======= Sistema de Eventos =======");
            if (loggedInUser == null) {
                System.out.println("1. Cadastrar usuário");
                System.out.println("2. Fazer login");
            } else {
                System.out.println("1. Cadastrar evento");
                System.out.println("2. Consultar eventos");
                System.out.println("3. Participar de evento");
                System.out.println("4. Cancelar participação em evento");
                System.out.println("5. Fazer logout");
            }
            System.out.println("0. Sair");
            System.out.print("Digite a opção desejada: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (loggedInUser == null) {
                switch (option) {
                    case 1:
                        cadastrarUsuario();
                        break;
                    case 2:
                        fazerLogin();
                        break;
                    case 0:
                        saveData();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } else {
                switch (option) {
                    case 1:
                        cadastrarEvento();
                        break;
                    case 2:
                        consultarEventos();
                        break;
                    case 3:
                        participarEvento();
                    case 4:
                        cancelarParticipacaoEvento();
                        break;
                    case 5:
                        fazerLogout();
                        break;
                    case 0:
                        saveData();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        }
    }

    private static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        String email;
        boolean validEmail = false;
        do {
            System.out.print("Email: ");
            email = scanner.nextLine();
            if (isValidEmail(email)) {
                validEmail = true;
            } else {
                System.out.println("Email inválido. Digite um email válido.");
            }
        } while (!validEmail);
        System.out.print("Senha: ");
        String password = scanner.nextLine();
        System.out.print("Idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        User user = new User(name, email, password, age);

        if (isEmailRegistered(email)) {
            System.out.println("Falha no cadastro. O email já está registrado.");
        } else {
            users.add(user);
            System.out.println("Usuário cadastrado com sucesso!");
        }

        System.out.println();
    }

    private static void fazerLogin() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        User user = getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            loggedInUser = user;
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Falha no login. Email ou senha inválidos.");
        }

        System.out.println();
    }

    private static void cadastrarEvento() {
        System.out.print("Título: ");
        String title = scanner.nextLine();
        System.out.print("Data e Hora (formato: yyyy-MM-dd HH:mm): ");
        String dateTimeStr = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, DATE_TIME_FORMATTER);
        System.out.print("Descrição: ");
        String description = scanner.nextLine();

        Event event = new Event(title, dateTime, description);
        events.add(event);

        System.out.println("Evento cadastrado com sucesso!");

        System.out.println();
    }

    private static void consultarEventos() {
        System.out.println("======= Eventos Cadastrados =======");
        for (Event event : events) {
            System.out.println(event);
            System.out.println("----------------------------------");
        }
        System.out.println();
    }

    private static void participarEvento() {
        System.out.print("Digite o título do evento: ");
        String title = scanner.nextLine();

        Event event = getEventByTitle(title);

        if (event != null) {
            if (event.getParticipants().contains(loggedInUser)) {
                System.out.println("Você já está participando desse evento.");
            } else {
                event.addParticipant(loggedInUser);
                System.out.println("Você foi adicionado(a) como participante do evento.");
            }
        } else {
            System.out.println("Evento não encontrado.");
        }

        System.out.println();
    }

    private static void cancelarParticipacaoEvento() {
        System.out.print("Digite o título do evento: ");
        String title = scanner.nextLine();

        Event event = getEventByTitle(title);

        if (event != null) {
            if (event.getParticipants().contains(loggedInUser)) {
                event.removeParticipant(loggedInUser);
                System.out.println("Você foi removido(a) como participante do evento.");
            } else {
                System.out.println("Você não está participando desse evento.");
            }
        } else {
            System.out.println("Evento não encontrado.");
        }

        System.out.println();
    }

    private static void fazerLogout() {
        loggedInUser = null;
        System.out.println("Logout efetuado com sucesso!");
        System.out.println();
    }

    private static void loadUsersFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USERS_FILE))) {
            users = (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar os usuários do arquivo. Iniciando com lista vazia.");
        }
    }

    private static void loadEventsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EVENTS_FILE))) {
            events = (List<Event>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar os eventos do arquivo. Iniciando com lista vazia.");
        }
    }

    private static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USERS_FILE))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os usuários no arquivo.");
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(EVENTS_FILE))) {
            oos.writeObject(events);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os eventos no arquivo.");
        }
    }

    private static boolean isValidEmail(String email) {
        // Implement your email validation logic here
        return email.contains("@");
    }

    private static boolean isEmailRegistered(String email) {
        return getUserByEmail(email) != null;
    }

    private static User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    private static Event getEventByTitle(String title) {
        for (Event event : events) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }
}
