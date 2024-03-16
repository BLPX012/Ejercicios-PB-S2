import java.util.Scanner;

public class Ejercicio55 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero: ");
        int n =  scanner.nextInt();

        if ((n % 2 == 0 || n % 3 ==  0 || n % 5 == 0 || n % 7 == 0) && (n != 2 && n != 3 && n != 5 && n != 7)) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        scanner.close();
    }
}

