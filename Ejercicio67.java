import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        int suma=1,axu=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un numero postivo");
        int numero = scanner.nextInt();

        for(int i = 1;i<numero;i++){
            suma += axu * (suma);
            System.out.println(suma);
            axu++;
        }
        System.out.println(suma);
        scanner.close();
    }
}