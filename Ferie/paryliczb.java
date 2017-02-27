import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class paryliczb{
    int NWD(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else b=b-a;
        }
        return a;
    }
    int sumacyfr(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    } 
    
    
    public static void main(String[] args) throws FileNotFoundException{
    paryliczb funkcje = new paryliczb();   
    File file=new File("PARY_LICZB.TXT");
    Scanner in=new Scanner(file);
    PrintWriter zapis = new PrintWriter("ZADANIE5.TXT");
    int liczba1,liczba2,sum1=0,sum2=0,sum3=0;
    for (int i=0; i<1000; i++){
        liczba1 = in.nextInt();
        liczba2 = in.nextInt();
        int q = funkcje.NWD(liczba1,liczba2);
        int w = funkcje.sumacyfr(liczba1);
        int e = funkcje.sumacyfr(liczba2);
        if (q==1){
            sum1=sum1+1;
        }
        if(w==e){
            sum2=sum2+1;
        }
        if(liczba1%liczba2 == 0 || liczba2%liczba1 == 0){
            sum3=sum3+1;
        }
        
        } 
        zapis.println("a) "+ sum3);
        zapis.println("b) "+ sum1);
        zapis.println("c) "+ sum2);
        zapis.close();
    }
}