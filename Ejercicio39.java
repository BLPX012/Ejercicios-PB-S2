import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu año de naciemiento: ");
        int nacimiento = scanner.nextInt();

        int edad = 2024 - nacimiento;

        int dias = edad * 365;

        double a = dias * 8;

        double answer = a/24;

        System.out.println("Ha dormido " + answer + " dias");
        scanner.close();
    }
}
