import java.util.Scanner;

public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha (día, mes, año):");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int año = scanner.nextInt();

        String estacion = determinarEstacion(dia, mes);

        System.out.println("La fecha " + dia + "/" + mes + "/" + año + " corresponde a la estación de " + estacion);
        scanner.close();
    }

    public static String determinarEstacion(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 || mes == 5) || (mes == 6 && dia <= 20)) {
            return "Primavera";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 || mes == 8) || (mes == 9 && dia <= 20)) {
            return "Verano";
        } else if ((mes == 9 && dia >= 21) || (mes == 10 || mes == 11) || (mes == 12 && dia <= 20)) {
            return "Otoño";
        } else {
            return "Invierno";
        }

    }
}