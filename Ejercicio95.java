import java.util.Arrays;

public class Ejercicio95 {
    public static void main(String[] args) {
        int[] vector = {5, 2, 9, 1, 7};

        Arrays.sort(vector);

        for (int i = 0; i < vector.length / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - i - 1];
            vector[vector.length - i - 1] = temp;
        }

        // Imprimir el vector ordenado de mayor a menor
        System.out.println("Vector ordenado de mayor a menor:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
