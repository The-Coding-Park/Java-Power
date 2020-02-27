
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        if(a%2!=0){
            System.out.println("Weird");
        }
        else if(a%2==0 && a>=2 && a<=5){
            System.out.println("Not Weird");
        }
        else if(a%2==0 && a>=6 && a<=10){
            System.out.println("Weird");
        }
        else if(a%2==0 && a>20){
            System.out.println("Not Weird");
        }
    }
}
