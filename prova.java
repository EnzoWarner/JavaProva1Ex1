import java.util.Locale;
import java.util.Scanner;
public class prova {
public static void main (String []args){
        Scanner sc = new Scanner (System.in);
                Locale.setDefault(Locale.US);
                System.out.println("Insira o valor da conversão: ");
   double valor = Double.parseDouble(sc.nextLine()) ;
   double valor1 = 0;
   valor1 = valor * 5.15;
   System.out.println("O valor convertido em reais: " + valor1);
}
}
