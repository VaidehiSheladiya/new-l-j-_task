
import java.util.Scanner;

//        Scanner scanner = new Scanner(System.in);

public class one{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your num2: ");
        int num2 = scanner.nextInt();

        int total = (num1 + num2) / 2;

        System.out.println("Average of num1 and num2: " + total);
    }
}


