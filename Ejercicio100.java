import java.util.Scanner;

public class Ejercicio100 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digiete el primer numero: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite el segundo numero: ");
        int n2 = scanner.nextInt();

        int suma = n1+n2;

        if (suma % 2 == 0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        scanner.close();
    }
}
