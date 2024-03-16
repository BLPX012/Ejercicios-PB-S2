import java.util.Scanner;
public class Ejercicio36 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite las horas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite los munitos");
        int minutos = scanner.nextInt();

        double rest1 = horas *15.00;
        double rest = 15.00/60;
        double rest2 = minutos * rest;
        double resultado = rest2 + rest1;


        System.out.println(resultado);
        scanner.close();
    }
    
    
}