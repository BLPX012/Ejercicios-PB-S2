import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int entero = scanner.nextInt();
        
        System.out.print("Ingrese un numero real: ");
        double real = scanner.nextDouble();
        
        System.out.print("Ha ingresado el numero entero: " + entero);
        System.out.print("Ha ingresado el numero real: " + real);

        scanner.close();
        
    }
}