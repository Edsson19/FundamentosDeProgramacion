import java.util.Scanner;

public class SaludoPorHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la hora (0-23): ");
        int hora = sc.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Error: la hora debe estar entre 0 y 23.");
        } else if (hora >= 6 && hora <= 12) {
            System.out.println("¡Buenos días!");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("¡Buenas tardes!");
        } else {
            System.out.println("¡Buenas noches!");
        }

        sc.close();
    }
}
