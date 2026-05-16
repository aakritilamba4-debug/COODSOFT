import java.util.Scanner;
import java.util.Random;
public class repeatgs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rnm = r.nextInt(100)+1;
        int gs=0;
        while(gs != rnm)
        {
            System.out.println("enter yoru guess");
            gs = s.nextInt();
            if(gs>rnm)
            {
                System.out.println("too high");
            }
            else if (gs< rnm)
            {
                System.out.println("too low");

            }
            else 
            {
                System.out.println("correct guess");

            }
        }

        s.close();
    }
    
}
