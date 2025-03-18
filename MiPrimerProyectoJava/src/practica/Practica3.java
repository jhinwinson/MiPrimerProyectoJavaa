package practica;
import java.util.Scanner;;
public class Practica3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO POSITIVO DE 1 O DOS DIGITOS");
        int numero = leer.nextInt();
       if (numero>=0){
        if (numero>=10 && numero<100){System.out.println("El NUMERO INGRESADO ES DE LOS DIGITOS");}
        else if (numero>=0 && numero<10) {System.out.println("EL NUMERO INGRESADO ES DE 1 DIGITO");
        }
       }
     else
    {System.out.println("EL NUMERO INGRESADO NO ES POSITIVO");}
    leer.close();
    }
}
