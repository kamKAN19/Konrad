import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class spr{
    int sumacyfr(int text){
        int suma=0;
        do{
            suma=suma+text%10;
            text=text/10;
        }while(text>0);
        return suma;
        }
    public String DecimalToBin(int n){
        String q = "";
        while(n>0){
        q=q + (char)(n%2 + 48);     
        n=n/2;
        }
        String reverse = new StringBuffer(q).reverse().toString(); 
        return reverse;
        }
    public static void main(String[] args) throws FileNotFoundException{
        spr funkcje = new spr();
        File file = new File("cyfry.txt");
        PrintWriter zapis = new PrintWriter("wynik.txt");
        Scanner in = new Scanner(file);
        int parz=0,max=0,max1=0,sumacyfr=0;
         for(int j=0; j<1000; j++){
             int text = in.nextInt();
             int text2 = text;
             if(text<10000){
                 zapis.println("c: " + text + " : " + funkcje.DecimalToBin(text));
             }
             if(text%2==0){
                 parz+=1;
             }
             sumacyfr=funkcje.sumacyfr(text);
             if(sumacyfr>max){
                 max = sumacyfr;
                 max1=text2;
             }
         }
        zapis.println(max1 + " z największą sumą cyfr: " + max);
        zapis.println("a) liczb parzystych jest: " + parz);
        zapis.close();
    }
}