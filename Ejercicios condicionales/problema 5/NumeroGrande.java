import java.util.Scanner;

public class NumeroGrande {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los números
        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt();

        // Evaluar las condiciones
        boolean resultado = (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6);

        // Mostrar resultado
        if (resultado) {
            System.out.println("Verdadero ");
        } else {
            System.out.println("Falso ");
        }

        scanner.close();
    }
}
