import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int n2 = scanner.nextInt();

        if(n1>n2){
            System.out.println(n1+" Es mayor que "+n2);
        }else if(n1==n2) {
            System.out.println(n1+" Es igual a "+n2);
        }else{
            System.out.println(n1+" es menor que "+n2);
        }
        scanner.close();
    }
}
