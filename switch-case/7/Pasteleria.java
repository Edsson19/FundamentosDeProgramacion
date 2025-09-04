import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio = 0;

        // Selección de sabor
        System.out.print("¿Qué sabor de tarta quieres? (manzana, fresa, chocolate): ");
        String sabor = sc.next().toLowerCase();

        switch (sabor) {
            case "manzana":
                precio = 200;
                break;
            case "fresa":
                precio = 250;
                break;
            case "chocolate":
                System.out.print("¿Chocolate negro o blanco?: ");
                String tipoChoco = sc.next().toLowerCase();
                if (tipoChoco.equals("negro")) {
                    precio = 280;
                } else if (tipoChoco.equals("blanco")) {
                    precio = 300;
                } else {
                    System.out.println("Opción de chocolate inválida.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Sabor inválido.");
                sc.close();
                return;
        }

        // Snack
        System.out.print("¿Quieres añadir un snack? (si/no): ");
        String snack = sc.next().toLowerCase();
        if (snack.equals("si")) {
            System.out.print("¿Cuántos snacks quieres añadir?: ");
            int cantidadSnacks = sc.nextInt();
            precio += cantidadSnacks * 25;
        }

        // Personalización con nombre
        System.out.print("¿Quieres personalizar con nombre? (si/no): ");
        String nombre = sc.next().toLowerCase();
        if (nombre.equals("si")) {
            precio += 30;
        }

        // Resultado final
        System.out.println("El precio total de la tarta es: $" + precio);

        sc.close();
    }
}
