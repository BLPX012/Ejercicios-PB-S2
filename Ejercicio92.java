import java.util.Scanner;

public class Ejercicio92 {
    
    public static void main(String[] args) {
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamano de los 2 vectores");
        int n1 = scanner.nextInt();

        double[] vector1 = new double[n1];
        double[] vector2 = new double[n1];

        for(int i =0; i < vector1.length;i++){

            vector1[i] = Math.random() * 100;
            vector2[i] = Math.random() * 100;

        }

        for (int i = 0; i < vector2.length; i++) {
            
            suma+= vector1[i] * vector2[i];
            
        }
        System.out.println("El vector 1 contiene");
        for (int i = 0; i < vector2.length; i++) {
            
            System.out.println(vector1[i]);
        }

        System.out.println("El vector 2 contiene");
        for (int i = 0; i < vector2.length; i++) {
            
            System.out.println(vector2[i]);
        }

        System.out.println("El producto escalar es de " + suma);

        scanner.close();

    }
}