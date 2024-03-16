import java.util.Scanner;;
public class Ejercicio48 {
    
    public static void main(String[] args) {
        double resultado;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su primer numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite el segundo numero: ");
        int n2 = scanner.nextInt();

        resultado = n2 + n1;
        System.out.println("Suma: " + resultado);
        resultado=0;

        resultado = n2 - n1;
        System.out.println("Resta: " + resultado);
        resultado=0;

        resultado = n2 * n1;
        System.out.println("Multiplicacion: " + resultado);
        resultado=0;

        resultado = n2 / n1;
        System.out.println("Division: " + resultado);
        resultado=0;

        resultado = n2 % n1;
        System.out.println("Modulo:" + resultado);

        scanner.close();

    }
}