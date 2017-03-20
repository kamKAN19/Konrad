import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class zadanie{
    public String DdC(int liczba1){
    String text = "";
    while(liczba1>0){
    text=text + (char)(liczba1%4 + 48);     
    liczba1=liczba1/4;
    }
    String reverse = new StringBuffer(text).reverse().toString(); 
    return reverse;
    }
    public int sumacyfr(int liczba1){
    int sum = 0;
    while(liczba1>0){
    sum=sum+liczba1%10;
    liczba1=liczba1/10;
    }
    return sum;
    }
    public static void main(String[] args) throws FileNotFoundException{
    File file = new File("liczby.txt");
    PrintWriter zapis = new PrintWriter("wynik.txt");        
    zadanie funkcje = new zadanie();
    Scanner in = new Scanner(file);
    int max = 0; 
    int sumacyfr = 0;
    int liczbamax=0;
    for(int j=0; j<4; j++){
    int liczba1 = in.nextInt();
    zapis.println(liczba1 + " , " + funkcje.DdC(liczba1));
    sumacyfr=funkcje.sumacyfr(liczba1);
    if(sumacyfr>max){
    max=sumacyfr;
    liczbamax=liczba1;
    }
    }
    zapis.println(liczbamax + " ma największą sumę cyfr wynoszącą: " + max);
    zapis.close();
    }
}