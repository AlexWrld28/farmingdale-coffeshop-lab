import java.util.Scanner;

public class mediumCup implements Cup {
    @Override
    public String milk() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number to choose: /n1. Whole/n2. Skim/n3. Almond/n4. Oat/n5. Soy/n Enter None");
        int choice;      // Reads an integer
        choice = Scanner.nextInt();
        String milk;
        switch (choice) {
            case 1:
                milk = "Whole";
                break;
            case 2:
                milk = "Skim";
                break;
            case 3:
                milk = "Almond";
                break;
            case 4:
                milk = "Oat";
                break;
            case 5:
                milk = "Soy";
                break;
            default:
                milk = "None";
                break;

        }
        return milk;
    }

    public String shots() {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.print("Enter a number to choose: /n1. Whole/n2. Skim/n3. Almond/n4. Oat/n5. Soy/n Enter None");
        int choice;      // Reads an integer
        choice = Scanner1.nextInt();
        String shots;
        switch (choice) {
            case 1:
                shots = "1";
                break;
            case 2:
                shots = "2";
                break;
            case 3:
                shots = "3";
                break;
            default:
                shots = "None";
                break;

        }
        return shots;
    }

    public String sweets() {
        Scanner Scanner2 = new Scanner(System.in);
        System.out.print("Enter a number to choose: /n1. Whole/n2. Skim/n3. Almond/n4. Oat/n5. Soy/n Enter None");
        int choice;      // Reads an integer
        choice = Scanner2.nextInt();
        String sweets;
        switch (choice) {
            case 1:
                sweets = "Sugar";
                break;
            case 2:
                sweets = "Honey";
                break;
            case 3:
                sweets = "Stevia";
                break;
            default:
                sweets = "None";
                break;
        }
        return sweets;
    }

}