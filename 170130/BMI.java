public class BMI{
    public static void main(String[] args){
        double c;
        if(args.length == 2)
        {
            
            
            double[] n = new double[args.length];
            for(int i=0; i<=1; i++)
            {
                n[i] = Double.parseDouble(args[i]);
            }
        c = n[0]/((n[1])*(n[1]));
        
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

        }
        else
        System.out.println("Błąd danych");

    }
}