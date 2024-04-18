public class Ejercicio124 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 3 dentro del rango del 1 al 3000:");

    
        for (int i = 1; i <= 3000; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
