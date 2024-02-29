import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la base");
        double base = scanner.nextDouble();
        System.out.println("Digite la altura");
        double altura = scanner.nextDouble();

        double resultado = (base*altura)/2;

        System.out.println("El resultado del area es " + resultado);
        scanner.close();
    }
}
