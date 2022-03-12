import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HereComesRecursion myObject = new HereComesRecursion();

        System.out.println("Enter the message to display.");
        String message = scanner.nextLine();

        System.out.println("Enter the number of times you want the message to display.");
        int times = scanner.nextInt();

        HereComesRecursion.recursionPractice(message, times);
    }


}
