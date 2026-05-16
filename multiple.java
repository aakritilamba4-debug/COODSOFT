import java.util.Scanner;
import java.util.Random;
public class multiple {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        char playagn;
        do 
        {
            int rnm = r.nextInt(100)+1;
            int gs=0;
            while(gs!=rnm)
            {
                System.out.println("enetr ur guess");
                gs=s.nextInt();
                if (gs>rnm) 
                {
                    System.out.println("too high");

                }
                else if (gs<rnm) 
                {
                    System.out.println("too low");
                }
                else 
                {
                    System.out.println("correct guess");

                }
            }
                System.out.println("DO YOU WANT TO PLAY AGAIN????");
                playagn = s.next().charAt(0);

            }
            while (playagn=='y' || playagn=='Y'); 
            
                s.close();
                
    }
}
