import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        // while (val != 5) {
        //     System.out.println("Enter a Number: ");
        //     val = input.nextInt();
        // }
        // System.out.println("Got 5");

        // using do while loop
        System.out.println("Using Do-While loop");
        do {
            System.out.println("Enter a Number: ");
            val = input.nextInt();
        }

        while (val != 5);
        System.out.println("Got 5!");
        input.close();
    }

}