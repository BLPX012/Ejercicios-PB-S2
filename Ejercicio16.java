import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el numero de preguntas del examen: ");
        int nPreguntas = scanner.nextInt();
        System.out.print("Digite el numero de respuestas acertadas: ");
        int nAcertadas = scanner.nextInt();

        double valorxPregutas = 5.0 / nPreguntas;

        double calificacion = nAcertadas * valorxPregutas;

        System.out.println("La calificacion del examen es: "+calificacion);
        scanner.close();

    }
}
