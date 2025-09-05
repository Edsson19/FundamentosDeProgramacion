import java.util.Scanner;

public class DosEsUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt();

        System.out.print("Ingresa el tercer número (c): ");
        int c = scanner.nextInt();

        
        boolean resultado = (a + b == c) || (a + c == b) || (b + c == a);

        
        if (resultado) {
            System.out.println("Verdadero ");
        } else {
            System.out.println("Falso ");
        }

        scanner.close();
    }
}
