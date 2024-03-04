import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el numero: ");
        float n = scanner.nextFloat();

        float ola = n*n*n;

        System.out.println("La raspuesta es: " + ola);
        scanner.close();
}
}

