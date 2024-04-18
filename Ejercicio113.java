import java.util.Scanner;

public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int distancia = 500;

        System.out.println("Seleccione el tipo de transporte:");
        System.out.println("1) Motocicleta");
        System.out.println("2) Automóvil");
        System.out.println("3) Pickup");
        System.out.print("Elija una opción (1-3): ");
        int opcion = scanner.nextInt();

        double rendimiento = 0;
        switch (opcion) {
            case 1:
                rendimiento = 20;
                break;
            case 2:
                rendimiento = 10;
                break;
            case 3:
                rendimiento = 5;
                break;
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }

        double litrosNecesarios = distancia / rendimiento;
        double costoGasolina = litrosNecesarios * obtenerPrecioGasolina();

        System.out.println("El costo estimado de gasolina para viajar a Monterrey es: $" + costoGasolina);

        scanner.close();
    }

    public static double obtenerPrecioGasolina() {
        return 20;
    }
}