import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = scanner.nextFloat();

        double area = 3.14 * (radio*radio);

        System.out.println("El area de la circunferencia es de: "+area);
        scanner.close();
        
    }
}
