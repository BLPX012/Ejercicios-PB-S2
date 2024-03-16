import java.lang.Math;

public class Ejercicio44 {
    public static void main(String[] args) {
        double pi = Math.PI;
        
        for (int n = 2; n <= 10; n++) {
            double potencia = calcularPotencia(pi, n);
            double raizCuadrada = Math.sqrt(potencia);
            
            System.out.println("Potencia de PI elevado a la " + n + "-ésima potencia: " + potencia);
            System.out.println("Raíz cuadrada de la potencia: " + raizCuadrada);
            System.out.println();
        }
    }
    
    public static double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
}
