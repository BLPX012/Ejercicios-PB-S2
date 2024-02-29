import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double iva = 0.19;

        System.out.print("Digite el valor de un articulo: ");
        double costo = scanner.nextDouble();

        double ola = costo*iva;

        System.out.println("El valor del iva del articulo es de: "+ ola);

        scanner.close();
    }
}
