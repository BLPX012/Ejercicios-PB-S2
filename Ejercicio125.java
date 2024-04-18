import java.util.Scanner;

public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del cual desea encontrar los múltiplos: ");
        int numero = scanner.nextInt();

        System.out.println("Múltiplos de " + numero + " dentro del rango del 1 al 3000:");

        for (int i = 1; i <= 3000; i++) {

            if (i % numero == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
