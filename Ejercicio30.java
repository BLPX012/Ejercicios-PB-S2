import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe Los kilometros: ");
        double kilometers = scanner.nextDouble();

        double ola = kilometers * 1000;
        System.out.println("Kilometros a centimetros: " + ola);
        scanner.close();
    }
}
