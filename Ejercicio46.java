import java.util.Scanner;

public class Ejercicio46 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite las millas");
        double millas = scanner.nextDouble();

        double metros = millas * 1825;

        System.out.println("Los metros son " + metros);

        scanner.close();
    }
}