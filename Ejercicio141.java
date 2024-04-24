import java.util.Scanner;

public class Ejercicio141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double num = scanner.nextDouble();

        double raiz = raizCuadrada(num);

        int raizEntera = (int) raiz;

        System.out.println("La raíz cuadrada de " + num + " es " + raiz);
        System.out.println("Truncada a numero entero es "+raizEntera);

        scanner.close();
    }
    public static double raizCuadrada(double num) {
        double inicio = 0;
        double fin = num;
        double medio = 0;
        double epsilon = 0.00001;

        while(fin - inicio > epsilon) {
            medio = (inicio + fin) / 2;
            if (medio * medio == num) {
                return medio;
            } else if (medio * medio < num) {
                inicio = medio;
            } else {
                fin = medio;
            }
        }

        return medio;
    }

}