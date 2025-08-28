import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el número b: ");
        int b = sc.nextInt();
        System.out.print("Ingresa el número c: ");
        int c = sc.nextInt();
        int suma_ab = a + b;
        int suma_bc = b + c;
        int var10000 = a + c;
        int resultado;
        if (suma_ab == 10) {
            resultado = 10;
        } else if (suma_ab > 10 && suma_bc < 10) {
            resultado = 5;
        } else {
            resultado = 0;
        }

        System.out.println("Resultado: " + resultado);
    }
}