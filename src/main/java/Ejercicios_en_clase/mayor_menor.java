package Ejercicios_en_clase;
import java.util.Scanner;

public class mayor_menor {
    public static void main  (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer  numero");

        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El primero numero (" + numero1 + ") es mayor que el segundo (" + numero2 + ").");
        } else {
            System.out.println("El segundo numero (" + numero2 + ") es mayor que el primero (" + numero1 + ").");
        }


    }
}
