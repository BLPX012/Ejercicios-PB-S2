import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese números (ingrese 0 para finalizar):");

        int suma = 0;

        int numero;
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        // Mostrar la suma total de los números
        System.out.println("La suma total de los números es: " + suma);
        scanner.close();
    }
}