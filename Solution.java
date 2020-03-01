import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double x= scan.nextDouble();
        scan.nextLine();
        String str=scan.next();

       

        System.out.println("String: " + str);
        System.out.println("Double: " + x);
        System.out.println("Int: " + i);
        scan.close();
    }
}