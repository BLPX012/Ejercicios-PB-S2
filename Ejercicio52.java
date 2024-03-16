import java.util.Scanner;
public class Ejercicio52 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un numero: ");
        int n1 = scanner.nextInt();

        int[] resultado = multiplicador(n1);
        for(int i = 0; i<= resultado.length; i++){

            System.out.println(resultado[i]);
        }

        scanner.close();
    }
    
    public static int[] multiplicador(int n){

        int[] array = new int[10];

        for(int i = 0;i<= 9; i++){

            int result = n * (i+1);
            array[i] = result;
        
        }

        return array;
    }
}