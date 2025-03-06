



import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        int i = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            do {
                factorial *= i;
                i++;
            } while (i <= num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        scanner.close();
    }
}