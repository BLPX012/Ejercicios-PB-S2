import java.util.Scanner;

public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String respuesta;
        
        do {
            System.out.println("Hola usuario!");
            System.out.println("¿Desea que siga imprimiendo el texto? [S/N]: ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
        
        System.out.println("¡Hasta luego!");
        scanner.close();
    }
}