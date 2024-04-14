import java.util.Scanner;
public class Ejercicio106 {

    public static int encontrarMCD(int m, int n) {

        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }

        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }


        int mcd = encontrarMCD(num1, num2);
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);

        scanner.close();
    }
}
