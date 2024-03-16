import java.util.Scanner;
public class Ejercicio53 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el lado");
        int lado = scanner.nextInt();

        System.out.println("El area es de " + calculo(lado));

        scanner.close();

    }

    public static int calculo(int ladoo){

        int result = ladoo * ladoo;

        return result;
    }
}