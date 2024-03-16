import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu año: ");
        int anio = scanner.nextInt();

        int gramos = anio * 8000;
        int manzanas = gramos/4;

        System.out.println("La cantidad de fruta consumida en gramos es de " + gramos);
        System.out.println("La cantidad de manzanas son de " + manzanas);
        scanner.close();
    }
}