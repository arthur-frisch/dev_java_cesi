public class Main {
    public static void main(String[] args) {
        Personne user1 = new Personne("admin", "azerty");
        Personne user2 = new Personne("tom", "123", 30);

        user1.print();
        user2.print();

        System.out.println(user1.email());

        user1.isAdmin = false;
        user1.print();
    }
}
