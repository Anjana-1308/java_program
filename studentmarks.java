
import java.util.*;

class studentmarks 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enterthe marks: ");
        int marks = obj.nextInt();
        if (marks >= 90 && marks <= 100) 
        {
           System.out.print("A grade");
        } else if (marks >= 80 && marks < 90) 
        {
            System.out.print("B grade");
        } else if (marks >= 70 && marks < 80) 
        {
            System.out.print("C grade");
        } else if (marks >= 60 && marks < 70) 
        {
            System.out.print("D grade");
        } else 
        {
           System.out.print("fail");
        }
    }
}