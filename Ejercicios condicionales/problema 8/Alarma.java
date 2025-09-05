import java.util.Scanner;

public class Alarma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el día de la semana (0=Dom, 1=Lun, ... 6=Sáb): ");
        int dia = scanner.nextInt();

        
        System.out.print("¿Estás de vacaciones? (true/false): ");
        boolean vacaciones = scanner.nextBoolean();

        String horaAlarma;

        if (!vacaciones) { 
            
            if (dia >= 1 && dia <= 5) {
                horaAlarma = "6:00"; 
            } else {
                horaAlarma = "9:00"; 
            }
        } else { 
            
            if (dia >= 1 && dia <= 5) {
                horaAlarma = "8:00"; 
            } else {
                horaAlarma = "off"; 
            }
        }

        
        System.out.println("La alarma suena a: " + horaAlarma);

        scanner.close();
    }
}
