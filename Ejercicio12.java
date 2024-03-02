import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros;
        numeros = new int[3];

        for(int i = 0; i<=2; i++){
            System.out.println("Ingrese un numero entero: ");
            numeros[i]= scanner.nextInt();
        }

        int promedio = (numeros[0] + numeros[1] + numeros[2])/2;

        int suma = numeros[0] + numeros[1] + numeros[2];

        int doble_primer = numeros[0] *2;

        int triple_segundo = numeros[1]*3;

        int cuadrado_tecer = numeros[2]*numeros[2];

        System.out.println("El prmedio de los numeros es: "+ promedio+"\nLa suma de los numeros es: "+suma);

        System.out.println("El doble del primer numeroe es: "+doble_primer+"\nEl triple del segundo numero es: "+ triple_segundo+"\nEl cuadrado del tercer numero es: "+cuadrado_tecer);

        scanner.close();
    }
}