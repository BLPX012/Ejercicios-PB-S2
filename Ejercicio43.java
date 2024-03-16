import java.util.Scanner;

public class Ejercicio43 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero 1");
        int n1 = scanner.nextInt();
        System.out.println("Digite el numero 2");
        int n2 = scanner.nextInt();

        if(n1>n2){
            System.out.println("El numero menor es " + n2);
        }else{
            System.out.println("El numero menor es  " + n1);
        }
        scanner.close();
    }
}
