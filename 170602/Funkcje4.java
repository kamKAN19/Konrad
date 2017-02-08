public class Funkcje4{
    void cyfry(int a){
        System.out.print(a+": ");
        do{
            System.out.print(a%10+", ");
            a=a/10;
            
            
        }while(a>0);
        System.out.println(" ");
    }
    public static void main(String[] args){
        if(args.length != 0)
        {
       Funkcje4 funkcje = new Funkcje4();
       int a = Integer.parseInt(args[0]);
       funkcje.cyfry(a);
        }
        else
        System.out.println("Błąd danych");
    }
}