package Ejercicios_en_clase;
import java.util.Scanner;
public class promedio_edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[5];
        System.out.println("Ingresa las edades de 5 estudiantes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        // Calcular el promedio
        double suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        double promedio = suma / edades.length;

        // Mostrar el promedio
        System.out.println("El promedio de edad de los estudiantes es: " + promedio);
    }

}
