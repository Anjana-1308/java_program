
import java.util.*;
class voteprogram 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the age:");
        int age = obj.nextInt();
        if(age>=18)
        {
           System.out.print("person is eligible for vote"); 
        }
        else
        {
            System.out.print("person is not eligible for vote ");
        }
        
    }
}