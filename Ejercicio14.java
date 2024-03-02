import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número de cuatro dígitos: ");
        int numero = scanner.nextInt();
        int sumaDigitos=0;

        if (numero >= 1000 && numero <= 9999) {
            // Calcular la suma de los dígitos
            sumaDigitos = 0;
            sumaDigitos += numero % 10;          
            sumaDigitos += (numero / 10) % 10;   
            sumaDigitos += (numero / 100) % 10;  
            sumaDigitos += (numero / 1000);
        }
        System.out.println("La suma de los digitos es: "+ sumaDigitos);
        scanner.close();
    }
}
