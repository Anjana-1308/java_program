
import java.util.*;
class relationaloperators 

{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the a value:");
        int a = obj.nextInt();
        System.out.print("enter the b value:");
        int b = obj.nextInt();
        System.out.print((a==b)||(a>b));
    }
}