import java.util.Scanner;
public class Ejercicio50 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        double n1 = scanner.nextDouble();
        System.out.println("Escribe el segundo numero: ");
        double n2 = scanner.nextDouble();
        System.out.println("Escribe el tercer numero: ");
        double n3 = scanner.nextDouble();
        double suma = n3 + n2 + n1;
        double multiplicacion = n3* n2 * n1;

        System.out.println("La suma es: " + suma);
        System.out.println("La multiplicacion es de: " + multiplicacion);
        scanner.close();

    }
    
}