import java.util.Scanner;

public class Ejercicio139 {
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite el numero que desea conocer el factorial");
    int numeros = scanner.nextInt();

    while (numeros<0) {
        System.out.println("Solo numeros enteros positivos, ingrese otro valor");
        numeros = scanner.nextInt();
    }
    
    int factorial = 1;

    for(int i=1; i<=numeros; i++){
        factorial *=i;
    }

    System.out.println("El factorial de "+numeros+" es "+factorial);

    scanner.close();
    }
}
