import java.util.Scanner;

public class ClasificarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la edad
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        // Clasificar según la edad
        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 65) {
            System.out.println("Eres adulto mayor.");
        } else {
            System.out.println("Eres mayor de edad.");
        }

        sc.close();
    }
}
