public class Person extends Exception implements Greeter{

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Illegal Argument EXCEPTION!!!!");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String sayHello() {
        return "Hello from " + this.firstName + " " + this.lastName + ".";
    }

    public static void main(String[] args) {
//        String jkl = null;
        Person alex = new Person("Alex", "Davila");
        Person jake = new Person("Jake", "Chadwell");
        System.out.println("alex.lastName = " + alex.lastName);
        System.out.println("alex.sayHello() = " + alex.sayHello());
        System.out.println("jake.sayHello() = " + jake.sayHello());

    }
}
