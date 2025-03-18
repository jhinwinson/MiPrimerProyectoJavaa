package practica;
import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LAS TRES NOTAS DEL ESTUDIANTE");
        double Nota1 = leer.nextDouble();
        double Nota2 = leer.nextDouble();
        double Nota3 = leer.nextDouble();
        double promedio = (Nota1 +Nota2+Nota3)/3;
        if (promedio>=7){System.out.println("PROMOCIONADO");}
        leer.close();
    }
}
