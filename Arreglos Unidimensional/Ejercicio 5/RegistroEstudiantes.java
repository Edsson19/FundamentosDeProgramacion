import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int n = Integer.parseInt(sc.nextLine());

        
        String[] nombres = new String[n];
        int[] edades = new int[n];
        double[] promedios = new double[n];

        
        System.out.println("\n=== CAPTURA DE DATOS ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine().trim();

            System.out.print("Edad: ");
            edades[i] = Integer.parseInt(sc.nextLine());

            System.out.print("Promedio: ");
            promedios[i] = Double.parseDouble(sc.nextLine());
        }

        
        System.out.println("\n=== LISTADO DE ESTUDIANTES ===");
        System.out.printf("%-20s %-8s %-10s%n", "NOMBRE", "EDAD", "PROMEDIO");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-8d %-10.2f%n", nombres[i], edades[i], promedios[i]);
        }

        sc.close();
    }
}
