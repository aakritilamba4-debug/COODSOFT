import java.util.Scanner;
public class guessinput 
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your guess ");
        int gs = sc.nextInt();
        System.out.println("your entered guess " + gs);
        sc.close();
        
   }   
}
