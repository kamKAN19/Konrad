import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class zad1{
    int sumacyfr1(int text2){
        int maks = 0;
        int nw=0,dod=0;
        do{
            nw = text2%10;
            text2 = text2/10;
            dod=dod+nw;
            if(dod>maks)
            maks=dod;
        }while(text2>0);
        return maks;
    }
    public static void main(String[] args) throws FileNotFoundException{
        zad1 funkcje = new zad1();
        File file=new File("cyfry.txt");
        PrintWriter zapis = new PrintWriter("parzyste.txt");
        PrintWriter zapis2 =new PrintWriter("zadanie4.txt");
        Scanner in=new Scanner(file);
        zapis2.println("Odpowiedź do podpunktu a): ");
        int ile=0,text2;
        int maks2=0;
        while(in.hasNextLine())
        {
            String text = in.nextLine();
            text2 = Integer.parseInt(text);
            if(text2%2==0)
            {
            zapis.println(text2);
            ile=ile+1;

            }
            maks2 = funkcje.sumacyfr1(text2);
        }
        zapis2.println("Liczb parzystych w pliku cyfry.txt jest: "+ ile);
        zapis2.println("Odp b): "+ maks2);
        zapis2.close();
    zapis.close();
    }
}