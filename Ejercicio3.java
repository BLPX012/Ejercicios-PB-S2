import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese Los parametros necesarios!!");
    System.out.print("Ingrse la altura del triangulo: ");
    float altura_triangulo = scanner.nextFloat();

    System.out.print("Ingrese base del triangulo: ");
    float base_triangulo = scanner.nextFloat();

    float area = (base_triangulo*altura_triangulo)/2;

    System.out.println("El area del triangulo es de: "+area);

    scanner.close();
}
}
