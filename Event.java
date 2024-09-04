import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Classe que representa um evento.
class Event implements Serializable {
    private String title;
    private LocalDateTime dateTime;
    private String location;
    private String description;
    private List<User> participants;

    // Construtor da classe Event.
    public Event(String title, LocalDateTime dateTime, String location, String description) {
        this.title = title;
        this.dateTime = dateTime;
        this.location = location;
        this.description = description;
        this.participants = new ArrayList<>();
    }

    public Event(String title, LocalDateTime dateTime, String description) {

    }

    // Obtém o título do evento.
    public String getTitle() {
        return title;
    }

    // Define o título do evento.
    public void setTitle(String title) {
        this.title = title;
    }

    // Obtém a data e hora do evento.
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    // Define a data e hora do evento.
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // Obtém o local do evento.
    public String getLocation() {
        return location;
    }

    // Define o local do evento.
    public void setLocation(String location) {
        this.location = location;
    }

    // Obtém a descrição do evento.
    public String getDescription() {
        return description;
    }

    // Define a descrição do evento.
    public void setDescription(String description) {
        this.description = description;
    }

    // Adiciona um participante ao evento.
    public boolean addParticipant(User user) {
        if (participants.size() >= 10) {
            return false;
        }
        participants.add(user);
        return true;
    }

    // Remove um participante do evento.
    public boolean removeParticipant(User user) {
        return participants.remove(user);
    }

    // Obtém a lista de participantes do evento.
    public Collection<User> getParticipants() {
        return participants;
    }
}
