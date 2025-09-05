import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la Velocidad: ");
        int velocidad = sc.nextInt();

        System.out.print("¿Es tu cumpleaños? (true/false): ");
        boolean cumple = sc.nextBoolean();
        
        if (cumple) {
            System.out.println("Resultado: no hay multa");
        } else {
            if (velocidad <= 60) {
                System.out.println("Resultado: no hay multa");
            } else if (velocidad <= 80) {
                System.out.println("Resultado: multa pequeña");
            } else {
                System.out.println("Resultado: multa grande");
            }
        }

        sc.close();
    }
}
