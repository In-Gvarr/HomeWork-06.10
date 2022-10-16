import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("No errors detected");
        }
        else {
            System.out.println("ERROR! " + "ERROR! " + "ERROR!");
        }
    }
}