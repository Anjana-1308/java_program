
public class sumwhileloop 
{
    public static void main(String[] args) {
        int sum = 0;
        int number = 2;

        while (number <= 50) {
            sum += number;
            number += 2;
        }
        System.out.println("The sum of even numbers between 1 and 50 is: " + sum);
    }
}