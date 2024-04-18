import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite 5 números: ");

        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma total de los números es: " + suma);
        scanner.close();
    }
}