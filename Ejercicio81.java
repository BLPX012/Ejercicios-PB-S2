import java.util.Scanner;


public class Ejercicio81 {
    
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el radio: ");
        double r = scanner.nextDouble();

        r = pi * (r*r);

        if(r>= 5000){
            System.out.println("Datos erroneos");
        }else{
            System.out.println("El area es de " + r);
        }

        scanner.close();
    }
}