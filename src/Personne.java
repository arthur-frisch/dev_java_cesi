public class Personne {
    private String login;
    private String password;
    private int age;
    public boolean isAdmin;

    public Personne(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.isAdmin = false;
    }

    public Personne(String login, String password) {
        this.login = login;
        this.password = password;
        this.age = 18;
        this.isAdmin = true;
    }

    public String email() {
        return login + "@cesi.com";
    }

    public void print() {
        System.out.println("Login : " + login + " ; Mdp : " + password + " ; Age : " + age + " ; Admin : " + isAdmin);
    }
}
