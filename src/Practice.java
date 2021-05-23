import java.util.ArrayList;

public class Practice{

    public static int square(int input) {
        return input * input;
    }

    public static int sum(int input1, int input2) {
        return input1 + input2;
    }

    public static double sum(double input1, double input2) {
        return input1 + input2;
    }

    public static double avg(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double finalAvg = total / array.length;
        return finalAvg;
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {
        ArrayList<User> newList = new ArrayList<>();
        for (User user : users) {
            user.setFirstName(user.getFirstName().substring(0,1).toUpperCase() + user.getFirstName().substring(1));
            user.setLastName(user.getLastName().substring(0,1).toUpperCase() + user.getLastName().substring(1));
            newList.add(user);
        }
        return newList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2};
        System.out.println("sum(2,16) = " + sum(2, 16));
        System.out.println("sum(1.2,2.3) = " + sum(1.2, 2.3));
        System.out.println("square(8) = " + square(8));
        System.out.println("avg(array) = " + avg(array));
        User alex = new User("alex", "davila", true);
        User irfa = new User("irfa", "sheikh", false);
        ArrayList<User> userArray = new ArrayList<>();
        userArray.add(alex);
        userArray.add(irfa);

        System.out.println("userArray.get(0).firstName = " + userArray.get(0).getFirstName());
        System.out.println("userArray.get(0).lastName = " + userArray.get(0).getLastName());
        System.out.println("userArray.get(1).firstName = " + userArray.get(1).getFirstName());
        System.out.println("userArray.get(1).lastName = " + userArray.get(1).getLastName());

        System.out.println("capitalizeRecords(userArray) = " + capitalizeRecords(userArray));

        System.out.println("userArray.get(0).firstName = " + userArray.get(0).getFirstName());
        System.out.println("userArray.get(0).lastName = " + userArray.get(0).getLastName());
        System.out.println("userArray.get(1).firstName = " + userArray.get(1).getFirstName());
        System.out.println("userArray.get(1).lastName = " + userArray.get(1).getLastName());
    }
}
