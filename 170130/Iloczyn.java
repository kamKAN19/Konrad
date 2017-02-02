public class Iloczyn{
    public static void main(String[] args){
        if(args.length != 0)
        {
            
            double a=1;
            double[] n = new double[args.length];
            for(int i=0; i<args.length; i++)
            {
                n[i] = Double.parseDouble(args[i]);
                a=a*n[i];
            }
            System.out.print("Twój iloczyn to: ");
            System.out.println(a);
            
        }
        else
        System.out.println("Błąd danych");
    }
}