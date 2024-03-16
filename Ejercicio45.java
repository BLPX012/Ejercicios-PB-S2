import java.util.Scanner;

public class Ejercicio45 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un numero: ");
        double numero = scanner.nextDouble();

        double number = Determinador(numero);

        System.out.println(number);
        scanner.close();
    }

    public static double Determinador(double number){

        if(number == 0){
            return 0;
        }if (number>=1) {
            return 1;
        } else {
            return -1;
        }

    }
}