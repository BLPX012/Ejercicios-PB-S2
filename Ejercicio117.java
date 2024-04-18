import java.util.Scanner;

public class Ejercicio117 {
    
    public static void main(String[] args) {
        int c=0;
        Scanner scanner =  new  Scanner(System.in);

        System.out.println("Hasta que numero desea contar");
        int numero = scanner.nextInt();

        for (int i = numero ; i >=0; i--) {
            
            c++;
            System.out.println(i);
        }

        System.out.println("La cantidad de numero contados fueron " + c);

        scanner.close();
    }
}