import java.util.Random;
import java.util.Arrays;
public class Losowanie{
    public static void main(String[] args){
        if(args.length >2)
        System.out.println("Za dużo danych");
        else
        {        
        if(args.length != 0)
        {
            int p,q;
            Random losuj = new Random(); 

            int c;
            
            
            int[] n = new int[args.length];
            
            
            for(int i=0; i<2; i++)
            {
                n[i] = Integer.parseInt(args[i]);
            }
            
            Arrays.sort(n);  
            
            p = n[0];
            
            q = n[1];
            
            c = losuj.nextInt(q-p+1)+p;
            System.out.println("Losowa liczba z Twojego przedziału: "+c);
           
        }
        else
        System.out.println("Błąd danych");
        }
        
    }
}