import java.io.Serializable;


//Classe que representa um usuário.

class User implements Serializable {
    private String name;
    private String email;
    private String password;
    private int age;

    //Construtor da classe User.

    public User(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    //Obtém o nome do usuário.

    public String getName() {
        return name;
    }

    //Define o nome do usuário.

    public void setName(String name) {
        this.name = name;
    }

    //Obtém o email do usuário.

    public String getEmail() {
        return email;
    }

    //Define o email do usuário.

    public void setEmail(String email) {
        this.email = email;
    }

    //Obtém a senha do usuário.

    public String getPassword() {
        return password;
    }

    //Define a senha do usuário.

    public void setPassword(String password) {
        this.password = password;
    }

    //Obtém a idade do usuário.

    public int getAge() {
        return age;
    }

    //Define a idade do usuário.

    public void setAge(int age) {
        this.age = age;
    }
}
