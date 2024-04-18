import java.util.Scanner;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();
        
        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
            return;
        }
        

        System.out.print("Ingresa el año: ");
        int year = scanner.nextInt();

        int numeroDias = obtenerNumeroDiasMes(numeroMes, year);
        
        System.out.println("El número total de días en el mes " + numeroMes + " del año " + year + " es: " + numeroDias);
        scanner.close();
    }
    
    public static int obtenerNumeroDiasMes(int numeroMes, int year) {
        int numeroDias;
        
        switch(numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numeroDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numeroDias = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    numeroDias = 29;
                else
                    numeroDias = 28;
                break;
            default:
                numeroDias = -1;
                break;
        }
        
        return numeroDias;
    }
}
