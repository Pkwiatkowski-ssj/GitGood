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
    }      
}