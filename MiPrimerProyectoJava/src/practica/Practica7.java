package practica;
import java.util.Scanner;
public class Practica7 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("INGRESA UN ENTERO POSITIVO");
        int Numero = leer.nextInt();
        if (Numero >= 0 && Numero <= 9){System.out.println(" EL NUMERO " + Numero +  " ES DE UNA SOLA SIFRA ");}
        else  if (Numero >= 10 && Numero <= 99){System.out.println(" EL NUMERO " + Numero + " ES DE DOS CIFRAS ");}
        else if (Numero >= 100 && Numero <= 999){System.out.println(" EL NUMERO " + Numero + " ES DE TRES CIFRAS ");}
        else {System.out.println(" ERROR, EL NUMERO :  " + Numero + " NO ESTA PERMITIDO");}
        leer.close();
}
}