import java.util.*;
class assignmentoperators 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the a value:");
        int a = obj.nextInt();
        System.out.print("enter the b value:");
        int b = obj.nextInt();
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a*=b;
        System.out.println(a);
        a/=b;
        System.out.println(a);
        a%=b;
        System.out.println(a);
        
    }
}