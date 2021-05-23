public class User extends Person{

    protected boolean admin;

    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public static void main(String[] args) {
        User vanessa = new User("Vanessa", "Noriega", false);
        System.out.println("vanessa.isAdmin() = " + vanessa.isAdmin());
    }
}