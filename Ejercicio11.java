import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base del rectangulo: ");
        int base = scanner.nextInt(); 
        System.out.print("Introduce la altura del rectangulo: ");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("El area del rectagulo es de: "+ area);



        scanner.close();
    }  
}
