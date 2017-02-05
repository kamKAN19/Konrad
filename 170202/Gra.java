import java.util.Random;
public class Gra{
    public static void main(String[] args){
        if(args.length >1)
        System.out.println("Za dużo danych");
        else
        {
        if(args.length !=0)
        {
            
            Random a = new Random();
          int c;  
          int b = Integer.parseInt(args[0]); 
          if (b != 0 && b!=1)
          {
              System.out.println("Dane poza zakresem");
          }
            else
            {
            c = a.nextInt(2)+0;
            if(b == c)
            {
                System.out.println("Wygrałeś, brawo!!! :D :D :D");
            }
            else
            System.out.println("Niestety ;//// spróbuj jeszcze raz ;)");
            }
        }
        else
        System.out.println("Brak danych");
         
        }

    }
}