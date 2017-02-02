import java.util.Scanner;
public class BMI2{
    public static void main(String[] args){
        int d;
        do{
        Scanner in = new Scanner(System.in);
        double a,b,c;
        System.out.println("Podaj wagę: ");
        
        a = in.nextDouble();
        
        System.out.println("Podaj wzrost: ");
        
        b = in.nextDouble();
        
        c = a/(b*b);
        
        if (c < 18.50)
        {
            System.out.println("Niedowaga, sorry ;/");
        }
        if (c >= 18.50 && c <= 24.99 )
        {
            System.out.println("Waga prawidłowa :D");
        }
        if (c > 24.99)
        {
            System.out.println("Nadwaga, sorry ;/");
        }
        System.out.println("Czy chcesz policzyć znowu?");
        System.out.println("1 - Tak, 2 - Nie");
        d = in.nextInt();
        }
        while(d == 1);
    }
}