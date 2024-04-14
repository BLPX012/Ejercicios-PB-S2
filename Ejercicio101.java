import java.util.Scanner;

public class Ejercicio101 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero a dividir: ");
        int numero = scanner.nextInt();

        System.out.println("Digite el divisor: ");
        int divisor = scanner.nextInt();

        if(numero % divisor == 0){
            System.out.println("Es divisible");
        }else{
            System.out.println("No es divisible");
        }

        scanner.close();

    }
}
