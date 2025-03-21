package practica;
import java.util.Scanner;
public class Practica6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("INGRESA UN NUMERO ENTERO:");
        int Numero = leer.nextInt();
        if (Numero > 0){System.out.println("EL NUMERO " + Numero + " ES POSITIVO.");}
        else if (Numero < 0){System.out.println("EL NUMERO " + Numero + " ES NEGATIVO ");}
        else {System.out.println("EL NUMERO " + Numero + " ES NULO ");}
        leer.close();
    }
}