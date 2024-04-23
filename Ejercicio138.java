import java.util.Scanner;

public class Ejercicio138 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        menu();
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado ");
                double lado = scanner.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.println("El área del cuadrado es " + areaCuadrado);
                break;
            case 2:
                System.out.println("Ingrese la base del triángulo ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("El área del triángulo es " + areaTriangulo);
                break;
            case 3:
                System.out.println("Ingrese el radio del círculo ");
                double radio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es " + areaCirculo);
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
        }
    } while (opcion != 0);

    scanner.close();
}
    public static void menu(){
        System.out.println("");
        System.out.println("******CALCULADORA DE ÁREAS******");
        System.out.println("1. Calcular área de un cuadrado");
        System.out.println("2. Calcular área de un triángulo");
        System.out.println("3. Calcular área de un círculo");
        System.out.println("0. Salir");
        System.out.println("Elija una opción: ");
    }

}