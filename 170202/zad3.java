import java.util.Random;
import java.util.Arrays;
public class zad3{
    public static void main(String[] args){
        
        
        Random losuj = new Random();
        
        int p,q;
        p=0;
        q=100;
        
            int n[];
            n = new int[10];
            
            
            for(int i=0; i<=10; i++)
            {
                n[i] = losuj.nextInt(q-p+1)+p;
            }
            
            Arrays.sort(n);
            
            for(int j=0; j<=10; j++)
            {
                System.out.print(n[j]+" , ");
            }
        
    }
}