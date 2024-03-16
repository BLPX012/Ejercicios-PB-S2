import java.util.Scanner;

public class Ejercicio57 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el salario por hora");
        int salario = scanner.nextInt();
        System.out.println("Escriba las horas trabajas");
        int horas = scanner.nextInt();

        System.out.println("Tu salario es de " + salario(salario,horas));

        scanner.close();

    }

    public static int salario(int salario, int horas){

         int pago = salario * horas;

        return pago;
}
}