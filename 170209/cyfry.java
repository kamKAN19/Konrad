import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class cyfry{
    int sumacyfr(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) throws FileNotFoundException{
    cyfry funkcje = new cyfry();   
    File file=new File("cyfry.txt");
    Scanner in=new Scanner(file);
    PrintWriter zapis = new PrintWriter("zadanie4.txt");
    int liczba1,max=0,min=100000,sum1=0;
    for(int j=0; j<1000; j++){
        liczba1 = in.nextInt();
        int q = funkcje.sumacyfr(liczba1);
        if(q>max){
            max = q;
        }
        if(q<min){
            min = q;
        }
        if(liczba1%2==0){
            sum1 = sum1 + 1;
        }
    }
    zapis.println("a) " + sum1);
    zapis.println("b) " + "największa suma cyfr: " + max);
    zapis.println("  najmniejsza suma cyfr: " + min);
    zapis.close();
    }
}