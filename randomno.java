import java.util.Random;
public class randomno
 {
    public static void main(String[] args)
    
    {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        System.out.println("RANDOM NUMBER :" + num);

    }
}
