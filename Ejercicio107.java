import java.util.Scanner;

public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;

        do {
            System.out.print("Ingrese su edad (entre 1 y 100 años): ");
            edad = scanner.nextInt();
            if (edad < 1 || edad > 100) {
                System.out.println("Por favor, ingrese una edad válida (entre 1 y 100 años).");
            }
        } while (edad < 1 || edad > 100);

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

        scanner.close();
    }
}
