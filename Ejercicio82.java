import java.util.Scanner;

public class Ejercicio82 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = scanner.nextInt();

        if(numero>0){
            System.out.println("El numero es positivo");
        }else if(numero == 0){
            System.out.println("El numero es 0");
        }else{
            System.out.println("El numero es negativo");
        }

        scanner.close();
    }
}