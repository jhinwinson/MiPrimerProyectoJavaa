package practica;
import java.util.Scanner;
public class Practica4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL SUELDO DEL EMPLEADO");
        Double Sueldo = leer.nextDouble();
        if (Sueldo>3000 ) {
            System.out.println("DEBE ABONAR IMPUESTOS");
        }

    }
}
