public class Funkcje5{
    int rosnaca(int a){
            int c=a%10;        
        do{

            if(c>(a/10)%10)
            {
               a=a/10;   
               return 1;
            }
            else
            return 0;

        }while(a>0);
        
   }
    

    public static void main(String[] args){
        if(args.length != 0)
        {
            Funkcje5 funkcje = new Funkcje5();
            int a= Integer.parseInt(args[0]);
            int b= a;
            System.out.println(funkcje.rosnaca(a));
        }
        else
        System.out.println("Błąd danych");
        
    }
}