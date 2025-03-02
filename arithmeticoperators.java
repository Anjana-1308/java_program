import java.util.*;
class arithmeticoperators 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the a value:");
        int a = obj.nextInt();
        System.out.print("enter the b value:");
        int b = obj.nextInt();
        System.out.println("addition:"+(a+b));
        System.out.println("subtraction:"+(a-b));
        System.out.println("multiplication:"+(a*b));
        System.out.println("modulus:"+(a%b));
        System.out.print("division:"+(a/b));
        
        
    }
}
