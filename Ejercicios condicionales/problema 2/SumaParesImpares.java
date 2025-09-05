public class SumaParesImpares {
    public static void main(String[] args) {
        int sumaPares = 0;
        int sumaImpares = 0;

        
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) { 
               
                sumaPares = sumaPares + i;
            } else {
                
                sumaImpares = sumaImpares + i;
            }
        }

        
        System.out.println("La suma de los números pares entre 1 y 200 es: " + sumaPares);
        System.out.println("La suma de los números impares entre 1 y 200 es: " + sumaImpares);
    }
}
