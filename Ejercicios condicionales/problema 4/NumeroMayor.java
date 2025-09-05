import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int mayor = Integer.MIN_VALUE; 
        boolean huboNegativo = false;  

        System.out.println("Ingresa números (termina con -99):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == -99) { 
                break; 
            }

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < 0) {
                huboNegativo = true;
            }
        }

        if (mayor != Integer.MIN_VALUE) {
            System.out.println("El número mayor es: " + mayor);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        if (huboNegativo) {
            System.out.println("Se ingresó al menos un número negativo.");
        }

        scanner.close();
    }
}
