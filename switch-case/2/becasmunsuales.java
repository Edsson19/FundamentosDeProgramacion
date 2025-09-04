import java.util.Scanner;

public class becasmunsuales {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		int promedio;
		boolean resultado;
		System.out.println("Ingresa tu edad: ");
		edad = Integer.parseInt(bufEntrada.readLine());
		if ((edad>18)) {
			System.out.println("Ingresa tu Promedio:");
			if ((promedio>=9)) {
				System.out.println("Tu beca Mensual es de $2000");
			} else {
				if ((promedio>=7.5)) {
					System.out.println("Tu beca Mensual es de $1000");
				} else {
					if ((promedio<7.5)) {
						System.out.println("Tu beca Mensual es de $500");
					} else {
						if ((promedio<6)) {
							System.out.println("Estudie mas en el proximo ciclo escolar");
						}
					}
				}
			}
		} else {
			if ((edad<=18)) {
				System.out.println("Ingresa tu Promedio:");
				if ((promedio>=9)) {
					System.out.println("Tu beca Mensual es de $3000");
				} else {
					if ((promedio<8)) {
						System.out.println("Tu beca Mensual es de $2000");
					} else {
						if ((promedio>=6)) {
							System.out.println("Tu beca Mensual es de $100");
						} else {
							if ((promedio<6)) {
								System.out.println("Estudie mas en el proximo ciclo escolar");
							}
						}
					}
				}
			}
		}
	}


}

