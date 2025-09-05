import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa un número no negativo: ");
        int num = scanner.nextInt();

        
        boolean resultado = (num % 3 == 0) ^ (num % 5 == 0);

        
        if (resultado) {
            System.out.println("Verdadero ");
        } else {
            System.out.println("Falso ");
        }

        scanner.close();
    }
}
