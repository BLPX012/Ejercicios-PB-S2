import java.util.Scanner;

public class Ejercicio134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();


        while (numero2 == numero1) {
            System.out.print("El segundo número debe ser diferente al primero. Inténtelo de nuevo:");
            numero2 = scanner.nextInt();
        }

        System.out.println("Ingrese el tercer número entero:");
        int numero3 = scanner.nextInt();


        while (numero3 == numero1 || numero3 == numero2) {
            System.out.println("El tercer número debe ser diferente a los anteriores. Inténtelo de nuevo:");
            numero3 = scanner.nextInt();
        }

        int mayor = Math.max(numero1, Math.max(numero2, numero3));
        int menor = Math.min(numero1, Math.min(numero2, numero3));

        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);

        scanner.close();
    }
}