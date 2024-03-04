import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int entero = 0, decimal = 0;

        System.out.println("Digite el numero");
        double numero = scanner.nextDouble();
        String numeroNew =  Double.toString(numero);

        int punto = numeroNew.indexOf(".");

        if(punto == -1){
            entero = Integer.parseInt(numeroNew);
        }else{
            String enteros = numeroNew.substring(0, punto);
            String decimales = numeroNew.substring( punto + 1);

            entero = Integer.parseInt(enteros);
            decimal = Integer.parseInt(decimales);
        }
        
        System.out.println("La parte entera es de " + entero + " y la decimal es de " + decimal);
        scanner.close();
    }
}
