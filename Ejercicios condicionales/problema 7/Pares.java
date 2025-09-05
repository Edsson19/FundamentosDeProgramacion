import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el número a: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el número b: ");
        int b = scanner.nextInt();

        System.out.print("Ingresa el número c: ");
        int c = scanner.nextInt();

        
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        int resultado;

        
        if (ab == 10 || bc == 10 || ac == 10) {
            resultado = 10;
        }
        
        else if (ab == bc + 10 || ab == ac + 10) {
            resultado = 5;
        }
        
        else {
            resultado = 0;
        }

        
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
