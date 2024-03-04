import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el sueldo basico");
        double sueldo = scanner.nextDouble();
        System.out.println("Digite el sueldo de horas extras");
        double sueldoExtra = scanner.nextDouble();
        
        double descuentoAproximado = sueldo * 20 / 100;
        double descuento = sueldo-descuentoAproximado;
        double total= descuento + sueldoExtra;

        System.out.println("El sueldo basico es de " + sueldo);
        System.out.println("El sueldo con descuento es de " + descuento);
        System.out.println("El total es de " + total);

        scanner.close();
    }
}