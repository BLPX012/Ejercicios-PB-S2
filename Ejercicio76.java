import java.util.Scanner;
public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un numero: ");
        int numero = scanner.nextInt();

        int cifras = contadorCifras(numero);

        System.out.println("El numero: "+numero + "; Tiene "+cifras+" Cifras");

        scanner.close();
    }

    public static int contadorCifras(int numero){
        String numString = Integer.toString(numero);

        return numString.length();
    }
}
