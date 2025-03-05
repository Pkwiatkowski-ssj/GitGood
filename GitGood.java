import java.util.ArrayList;// Import ArrayList
import java.util.Scanner; // Import Scanner for user input

public class GitGood {
    public static void main(String[] args) {
        // ADD METHODS
        processArray();
        printForLoop();
        printDoWhileLoop();
        printWhileLoop();
        checkEvenOrOdd(10);
        determineDayOfWeek();
        processList();
    }
    // Array

    public static void processArray(){
        System.out.println("\nArray Example (Fixed Size):" );

        int [] numbers = {1, 2, 3, 4, 5};

        for (int num : numbers) {
            System.out.println("Array Element: " + num);
        }
    }
    // lists
    public static void processList() {
    System.out.println("\nArrayList examples: ");

    ArrayList<String> names = new ArrayList<>();
    names.add("Kilo");
    names.add("Goku");
    names.add("GitGood");
    names.add("Java");

    for (String name : names){
        System.out.println("List Element: " + name);
    }
}
    // 🟢 1. FOR LOOP (Repeats a set number of times)
    public static void printForLoop() {
        System.out.println("\nFor Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Count: " + i);
        }
    }

    // 🟢 2. DO-WHILE LOOP (Runs at least once, then repeats if condition is met)
    public static void printDoWhileLoop() {
    System.out.println("\nDo-While Loop Example:");
    int i = 6;
   do {
        System.out.println("Do-While Loop Count: " + i);
        i++;
    }while(i <= 10);
}

    // 🟢 3. WHILE LOOP (Repeats as long as condition is true)
    public static void printWhileLoop() {
        System.out.println("\nWhile Loop Example:");
        int j = 11;
        while (j <= 15) {
            System.out.println("While Loop Count: " + j);
            j++;
        }
    }

    // 🟢 4. IF-ELSE (Checks conditions)
    public static void checkEvenOrOdd (int num) {

        if (num % 2 == 0) {
            System.out.println("\n" + num + " is an Even number.");
        } else {
            System.out.println("\n" + num + " is an Odd number.");
        }
    }

    // 🟢 5. SWITCH-CASE (Handles multiple conditions)
    private static void determineDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number (1-7) for a day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number! Enter 1-7.");
        }

        scanner.close(); // Close scanner to avoid memory leaks
    }
}