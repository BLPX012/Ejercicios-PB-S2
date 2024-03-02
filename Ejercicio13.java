import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite un numero entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite un numero entero: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite un numero entero: ");
        int numero3 = scanner.nextInt();
        
        int ultimos_digitos1 = numero1%10;
        int ultimos_digitos2 = numero2%10;
        int ultimos_digitos3 = numero3%10;
        
        System.out.println("Los ultimos digitos del primer numero es: "+ultimos_digitos1);
        System.out.println("Los ultimos digitos del segundo numero es: "+ultimos_digitos2);
        System.out.println("Los ultimos digitos del tercer numero es: "+ultimos_digitos3);
        
        scanner.close();
    }
}
