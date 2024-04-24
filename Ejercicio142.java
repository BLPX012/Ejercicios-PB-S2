import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita el numero a elevar");
        int numero = scanner.nextInt();

        System.out.println("Digite la potencia");
        int potencia = scanner.nextInt();


        double elevar = Math.pow(numero, potencia);

        System.out.println(+numero+" elevado a "+potencia+" es igual a "+elevar);

        scanner.close();
    }
}