import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your favorite car make?");
        String newMake = keyboard.next();

        System.out.println("What is your favorite car model?");
        String newModel = keyboard.next();

        System.out.println("What is your favorite car year?");
        int newYear = keyboard.nextInt();

        Car myFavoriteCar = new Car();
        myFavoriteCar.setMake(newMake);
        myFavoriteCar.setModel(newModel);
       myFavoriteCar.setYear(newYear);

        System.out.println(myFavoriteCar.getMake());
        System.out.println(myFavoriteCar.getModel());
        System.out.println(myFavoriteCar.getYear());

        int age = myFavoriteCar.computeAge();
        System.out.println(age);
    }
}
