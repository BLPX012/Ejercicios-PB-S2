import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        String texto = scanner.next();

        System.out.println("El texto ingresado es: "+texto);
        scanner.close();
    }
}
