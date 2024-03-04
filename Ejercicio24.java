import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite las pulgadas que desa convertir: ");
        double pulgadas = scanner.nextDouble();

        double centimetros = pulgadas * 2.54;

        System.out.println("De pulgadas a centimetros es: " + centimetros );
        scanner.close();

    }
}
