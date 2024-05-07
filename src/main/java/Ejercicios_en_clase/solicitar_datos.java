package Ejercicios_en_clase;

import java.util.Scanner;

public class solicitar_datos {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Donde vives");
        String ciudad = scanner.nextLine();
        System.out.println(ciudad + " es la mejor Ciudad");

        System.out.println("Cual es tu edad?");
        String edad= scanner.nextLine();
        System.out.println(edad+", estas muy joven");

        System.out.println ("Cual es tu numero de telefono");
        String telefono= scanner.nextLine();

        System.out.println("Cual fue el ultimo estudio que realizaste");
        String estudios= scanner.nextLine();

        scanner.close();

    }

}
