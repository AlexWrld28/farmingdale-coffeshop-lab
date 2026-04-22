import java.util.Scanner;
public class DriverClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like something hot or iced today?\n1. Hot\nIced");
        int drink = scanner.nextInt(); // Gets users drink preference
        if (drink == 1) {
            HotDrink myCoff = new HotSetFactory().getInstance("4K");
        }


    }
}