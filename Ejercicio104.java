import java.util.Scanner;

public class Ejercicio104 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el indice de la raiz: ");
        int indice = scanner.nextInt();

        System.out.println("Digite el numero de la raiz: ");
        double raiz = scanner.nextDouble();

        double indiceE = 1.0/indice;
        
        double raizZ = Math.pow(raiz, indiceE);

        System.out.println("La raiz es de " + raizZ);

        scanner.close();
    }
}