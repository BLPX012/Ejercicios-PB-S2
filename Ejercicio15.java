import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.print("Digite su edad");
        int edad = scanner.nextInt();

        if (edad <=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("NO eres mayor de edad");
        }
        scanner.close();
    }
}
