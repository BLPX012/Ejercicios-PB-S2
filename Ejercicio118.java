import java.util.Scanner;

public class Ejercicio118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Ingrese los montos de los 10 artículos:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Monto del artículo " + i + ": ");
            double monto = scanner.nextDouble();
            total += monto;
        }

        System.out.println("El monto total a pagar es: " + total);

        scanner.close();
    }
}