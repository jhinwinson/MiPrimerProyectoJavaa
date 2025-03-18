package practica;
import java.util.Scanner;
public class Practica5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE DOS NUMERO ENTEROS");
        int Num1 = leer.nextInt();
        int Num2 = leer.nextInt();
        if (Num1>Num2){System.out.println("EL NUMERO MAYOR ES: "+Num1);}
        else {System.out.println("EL NUMERO MAYOR ES: "+Num2);
        }
    }
}
