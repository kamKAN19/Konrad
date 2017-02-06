public class Funkcje1{
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
        
        
        
    
        Funkcje1 funkcje = new Funkcje1(); 
        
            int a = Integer.parseInt(args[0]);
            
         System.out.println(funkcje.pierwsza(a));
    }
}

