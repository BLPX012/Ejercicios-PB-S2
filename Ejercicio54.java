import java.util.Scanner;
public class Ejercicio54 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite los cm");
        double cm = scanner.nextDouble();

        System.out.println("pulgadas" + convercion(cm));

        scanner.close();

    }

    public static double convercion(double cm ){

        double resultado = cm /2.54;

        return resultado;
    }
}
