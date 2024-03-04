import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIgite un numero entero: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(n-i);
        }
        scanner.close();
    }
}
