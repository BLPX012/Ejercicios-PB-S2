import java.util.Scanner;

public class Ejercicio149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numero = 0;
        
        while(numero != numeroAleatorio) {
            System.out.println("Adivina que numero es del 1 al 100");
            System.out.println("Digite un número: ");
            numero = scanner.nextInt();
            
            if(numero < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor al número aleatorio");
                System.out.println("");
            } else if(numero > numeroAleatorio) {
                System.out.println("El número que ingresaste es mayor al número aleatorio");
                System.out.println("");
            }
            intentos++;
        }
        
        System.out.println("Felicidades adivinaste el número");
        System.out.println("Lo lograste en  " + intentos+" intentos");

        scanner.close();
        
    }
}
