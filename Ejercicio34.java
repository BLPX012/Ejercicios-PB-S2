import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el monto de la compra en pesos: ");
        double montoCompra = scanner.nextDouble();

        
        double descuento = 0.0;
        if (montoCompra > 1000) {
            descuento = montoCompra * 0.10;
        } else if (montoCompra > 500) {
            descuento = montoCompra * 0.20;

        
        if (descuento > 0) {
            System.out.println("Se aplicó un descuento de $" + descuento);
        } else {
            System.out.println("No se aplicó ningún descuento.");
        }

        double montoFinal = montoCompra - descuento;
        System.out.println("El monto a pagar después del descuento es: $" + montoFinal);

        scanner.close();

    }
}
}