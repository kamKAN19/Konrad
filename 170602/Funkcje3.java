import java.util.Random;
import java.util.Scanner;
public class Funkcje3{
    String pierwsza(int a){
        if(a>2)
        {
            for(int i=2; i<=Math.sqrt(a); i++)
            {
                if(a%i==0)
                return "liczba złożona";
            }
        }
        return "liczba pierwsza";
        }
        
    
    public static void main(String[] args){
        int b;
        do{
            
        Scanner in = new Scanner(System.in);    
        Funkcje1 funkcje = new Funkcje1(); 
        Random losuj = new Random();
        
            int a;
            int p=0;
            int q=100;
            int[] n = new int[10];
           
            for(int j=0; j<10; j++)
            {
                n[j] = losuj.nextInt(q-p+1)+p;
            }
            for(int g=0; g<10; g++)
            {
               System.out.println("Liczba " + n[g] + " to " + funkcje.pierwsza(n[g])); 
            }
         
        
        System.out.println("Czy chcesz kontynuować? 1-tak");
        b= in.nextInt();
        }while(b==1);
    
}
}

