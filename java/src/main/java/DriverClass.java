import java.util.Scanner;
public class DriverClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type one of the following words to select a drink size:\n1. Large\n2. Medium\n3. Small\n");
        String size = scanner.nextLine(); // Reads a string

        Cup myCup = new CupSetFactory().getInstance(size);

        myCup.milk();
        myCup.shots();
        myCup.sweets();
    }
}