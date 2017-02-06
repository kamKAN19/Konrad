import java.util.Scanner;
public class Funkcje2{
    String pierwsza(int a){
        if(a>2)
        {
            for(int i=2; i<=Math.sqrt(a); i++)
            {
                if(a%i==0)
                return "Liczba złożona";
            }
        }
        return "Liczba pierwsza";
        }
        
    
    public static void main(String[] args){
        int b;
        do{
        Scanner in = new Scanner(System.in);
        Funkcje1 funkcje = new Funkcje1(); 
        
            int a;
            System.out.println("Podaj liczbę jaką chcesz sprawdzić: ");
            a= in.nextInt();
            
         System.out.println(funkcje.pierwsza(a));
        
        System.out.println("Czy chcesz kontynuować? 1-tak");
        b= in.nextInt();
        }while(b==1);
    
}
}

