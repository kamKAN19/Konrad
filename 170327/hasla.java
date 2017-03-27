import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class hasla{
    public static void main(String[] args) throws FileNotFoundException{
        hasla funkcje = new hasla();
        File file = new File("hasla.txt");
        Scanner in = new Scanner(file);
        int parz=0,nieparz=0;
        PrintWriter zapis = new PrintWriter("wynik4a.txt");
    for(int j=0; j<200; j++){
        String haslo = in.nextLine();
        int q = haslo.length();
        if(q%2==0){
            parz=parz + 1;
        }
        else{
            nieparz=nieparz + 1;
        }
    }
    zapis.println("hasla parzyste: " + parz);
    zapis.println("hasla nieparzyste: " + nieparz);
    zapis.close();
}
}