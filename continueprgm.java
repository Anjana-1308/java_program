




public class continueprgm 
{
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue; // Skip to the next iteration if i is a multiple of 5
            }
            System.out.println(i);
        }
    }
}
