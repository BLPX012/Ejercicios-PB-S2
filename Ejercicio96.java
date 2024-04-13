import java.util.Scanner;

public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        
        String[] palabras = frase.split(" ");

        System.out.println("Palabras y su longitud:");
        for (String palabra : palabras) {
            System.out.println(palabra);
            System.out.println("Longitud: " + palabra.length());
            System.out.println();
        }

        scanner.close();
    }
}
