import java.util.Scanner;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la tarifa por hora: ");
        double tarifaHora = scanner.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();

        double salario = calcularSalario(tarifaHora, horasTrabajadas);
        System.out.println("El salario total es: $" + salario);

        scanner.close();
    }

    public static double calcularSalario(double tarifaHora, int horasTrabajadas) {
        double salarioTotal;

        if (horasTrabajadas <= 40) {
            salarioTotal = tarifaHora * horasTrabajadas;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            salarioTotal = (tarifaHora * horasNormales) + (tarifaHora * 2 * horasExtras);
        }

        return salarioTotal;
    }
}