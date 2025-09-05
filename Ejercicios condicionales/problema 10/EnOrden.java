import java.util.Scanner;

public class EnOrden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt();

        System.out.print("Ingresa el tercer número (c): ");
        int c = scanner.nextInt();

        
        System.out.print("¿Permitir igualdad (true/false)? ");
        boolean equalOk = scanner.nextBoolean();

        boolean resultado;

        if (equalOk) {
            resultado = (a <= b && b <= c);
        } else {
            resultado = (a < b && b < c);
        }

        
        if (resultado) {
            System.out.println("Verdadero ");
        } else {
            System.out.println("Falso ");
        }

        scanner.close();
    }
}
