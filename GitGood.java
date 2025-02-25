import java.util.Scanner;

public class GitGood {

    public static void main(String[] args) {
        // loop that prints 1 - 5
        for (int i =1; i <= 5; i++) {
            System.out.println("Count: " +i);
        }
        int i = 6;
        do {System.out.println("Count: " + i);
        i++;
        } while ( i <= 10);
        int j = 11;
        while (j < 16) {
            System.out.println("Count: " +j);
            j++;
        }
        // checking even or odd
        int num = 10;
        if (num % 2 ==0) {
            System.out.println(num +" is an even number");
        } else { 
            System.out.println(num + " is an odd number");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7) for a day of the week: ");
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
            System.out.println("Invalid numeber!");
        }
        scanner.close();
    }      
}