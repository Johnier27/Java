package Ejercicios_en_clase;
import java.util.Scanner;

public class numero_par {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de números: ");

    int cantidadNumeros = scanner.nextInt();

    int[] numeros = new int[cantidadNumeros];

    System.out.println("Ingrese los números:");

    for (int i = 0; i < cantidadNumeros; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
    }

    System.out.println("Números pares:");
    for (int numero : numeros) {
        if (numero % 2 == 0) {
            System.out.println(numero);
        }
    }

    scanner.close();
}

}
