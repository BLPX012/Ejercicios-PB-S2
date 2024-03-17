import java.util.Scanner;

public class Ejercicio77 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el capital: ");
        double capital = scanner.nextDouble();

        System.out.print("Digite el interes anual: ");
        double interes = scanner.nextDouble();
        
        System.out.print("Digite el numero de años: ");
        double años = scanner.nextDouble();

        interes = interes/12;
        años = 12*años;

        double formula = (interes * capital)/(1-Math.pow((1/(1+interes)), años));

        System.out.println("Los pagos mensuales son de " + formula);
        System.out.println("El total a pagar " + formula*años);

        scanner.close();
    }
}
