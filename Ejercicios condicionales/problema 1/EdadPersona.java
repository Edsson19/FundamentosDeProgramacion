import java.util.Scanner;

public class EdadPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        
        if (edad < 18) {
            System.out.println("Eres Menor de edad.");
        } else if (edad < 65) {
            System.out.println("Eres Mayor de edad.");
        } else {
            System.out.println("Eres Un Adulto Mayor.");
        }

        scanner.close();
    }
}
