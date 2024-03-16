import java.util.Scanner;
public class Ejercicio66 {
    
    public static void main(String[] args) {
        int suma=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIgite un numero entero positivo: ");
        int numero = scanner.nextInt();

        for(int i = 1; i<2*numero -1;i+=2){
            System.out.println(suma+=i);
        }

        System.out.println("La suma de los numeros es de " + suma);
        scanner.close();
    }
}
