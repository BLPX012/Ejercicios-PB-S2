import java.util.Scanner;

public class Ejercicio69 {
    
    public static void main(String[] args) {
        int sum=21+22;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas veces desea sumar: ");
        int suma = scanner.nextInt();

        for(int i = 1; i < suma+1;i+=1){
            sum += (i+1);
        }

        System.out.println("La suma total es de " + sum);
        scanner.close();
    }
}
