import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite los grados centigrados: ");
        int degrees = scanner.nextInt();

        double conversion = (degrees * 9)/5 + 32;

        System.out.println("Los grados fahrenheit es: " + conversion);
        scanner.close();
    }
}
