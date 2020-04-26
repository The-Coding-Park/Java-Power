import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter a Command: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        switch (text) {
            case "date":
                System.out.println("today is 25th April");
                break;
            case "year":
                System.out.println("2020");
                break;
            case "Situation":
                System.out.println("corona on going");
                break;
            default:
                System.out.println("no input found !");
                break;
        }
        input.close();

    }
}