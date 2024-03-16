import java.util.Scanner;
public class Ejercicio40 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite los kilos de oro: ");
        double oro = scanner.nextDouble();
        System.out.println("Digite el precio por onzas: ");
        double onzas = scanner.nextDouble();
        oro= oro * 1000;
        double resta = oro/28.3495;

        double resultado = resta * onzas;

        System.out.println("El precio del oro es de " + resultado);
        scanner.close();
    }
} 
    

