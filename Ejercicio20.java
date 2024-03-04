import java.util.Scanner;

public class Ejercicio20 {
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sumatoria = 0;
        int []numeros;

        numeros = new int[5];

       for (int i = 0; i < 5; i++){
        System.out.print("Digite la nota "+(i+1)+": ");
        numeros[i] = scanner.nextInt();
        sumatoria += numeros[i];
       }

       int promedio = sumatoria / 5;
       int doble = sumatoria * 2;

       System.out.println("La sumatoria de las notas es: "+sumatoria+"\nEl promedio de las notas es: "+promedio+"\nEl Doble de las notas es: "+doble);
        
        scanner.close();
    }
}
