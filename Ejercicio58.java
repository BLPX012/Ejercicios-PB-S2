import java.util.Scanner;

public class Ejercicio58 {
    
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite un numero del 1 al 10");
        int numero = scanner.nextInt();

        multiplicacion(numero);
        scanner.close();
    }

    public static void  multiplicacion(int numero){

        for(int i = 0 ; i <= 10; i++){

            System.out.println(numero * i);
        }
    }
}
