import java.util.Scanner;

public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Línea de autobuses ADO, seleccione su destino:");
        System.out.println("a) Cartagena. [$150]");
        System.out.println("b) Barranquilla. [$320]");
        System.out.println("c) Sincelejo. [$120]");
        System.out.println("d) Valledupar. [$90]");
        System.out.println("e) Santa Marta.[$110]");

        System.out.print("Seleccione su destino (a-e): ");
        char opcion = scanner.next().charAt(0);

        double precio = 0.0;
        String destino = "";

        switch(opcion) {
            case 'a':
                precio = 150;
                destino = "Cartagena";
                break;
            case 'b':
                precio = 320;
                destino = "Barranquilla";
                break;
            case 'c':
                precio = 120;
                destino = "Sincelejo";
                break;
            case 'd':
                precio = 90;
                destino = "Valledupar";
                break;
            case 'e':
                precio = 110;
                destino = "Santa Marta";
                break;
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }

        System.out.println("Ha seleccionado " + destino + ". El precio del boleto es: $" + precio);

        scanner.close();
    }
}