import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el valor de la Diagonal menor: ");
        double diagonal_menor = scanner.nextDouble();

        System.out.print("Digite el valor de la Diagonal mayor: ");
        double diagonal_mayor = scanner.nextDouble();

        Double Area = (diagonal_mayor*diagonal_menor)/2;

        System.out.println("El area del rombo es de: "+Area);

        scanner.close();
        
    }
}
