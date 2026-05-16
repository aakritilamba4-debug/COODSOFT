import java.util.Scanner;
import java.util.Random;

public class Attempts {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rnm = r.nextInt(100)+1;
        int maxatmpt = 5;
        int atmpt = 0;
        int gs;
        while(atmpt< maxatmpt)
        {
            System.out.println("enter your guess");
            gs = s.nextInt();
            atmpt++;
            if(gs==rnm)
            {
                System.out.println("you guessed it ryttttt '-' ");
                break;
            }
            else if(gs>rnm)
            {
                System.out.println("too high");

            }
            else if(gs<rnm)
            {
                System.out.println("too low");
            }
            System.out.println("ATTEMPTS LEFT "+ (maxatmpt-atmpt));

        }
        if(atmpt==maxatmpt)
        {
            System.out.println("no more attempts left restart the game again.-.");
            System.out.println("correct number was " + rnm);
        }
        s.close();
    }
}
