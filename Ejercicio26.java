import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el valor del Cateto 1: ");
        double Cateto1 = scanner.nextInt();

        System.out.print("DIgite el valor del Cateto 2: ");
        double Cateto2 = scanner.nextInt();

        double hipotenusa = Math.sqrt(Math.pow(Cateto1,2)+ Math.pow(Cateto2, 2));

        System.out.println("El cuadrado de la hipotesuna del triangulo rectagulo es: "+Math.pow(hipotenusa,2));
        scanner.close();
    }
}

