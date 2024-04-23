import java.util.Scanner;

public class Ejercicio140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int suma = 0;
        int factorial = 1;

        do {
            menu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Saliendo.....");
                    break;
                case 2:
                    System.out.println("Digita el numero entero que desea conocer su sumatoria");
                    int numero = scanner.nextInt();

                    while (numero<0) {
                        System.out.println("Digite un numero entero positivo");
                        numero = scanner.nextInt();
                    }
                    for(int i=0; i<=numero; i++){
                        suma +=i;
                    }
                    System.out.println("La sumatoria de "+numero+" es "+suma);
                    
                    break;
                case 3:
                    System.out.println("Digita el numero entero que desea conocer su factorial");
                    int numeroFactorial = scanner.nextInt();

                    while (numeroFactorial<0) {
                    System.out.println("Digite un numero entero positivo");
                    numero = scanner.nextInt();
                    }
                    for(int i=1; i<=numeroFactorial; i++){
                    factorial *= i;
                    }
                    System.out.println("El factorial de "+numeroFactorial+" es "+factorial);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion !=1);

        scanner.close();
    }

    public static void menu(){
        System.out.println("");
        System.out.println("****Calculadora****");
        System.out.println("1) Salir ");
        System.out.println("2) Sumatoria");
        System.out.println("3) Factorial");
        System.out.println("Digite una opcion");
    }
}