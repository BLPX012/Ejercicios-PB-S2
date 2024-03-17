 import java.util.Scanner;

public class Ejercicio71 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int suma=1,euler=1,axu=0;
        System.out.println("Cuantas veces desea hacer la secuencia fibonacci: ");
        int numero = scanner.nextInt();

        for(int i = 0; i<numero;i++){
            axu=suma;
            suma= euler + suma;
            euler=axu;
            System.out.println(suma);
        }
        scanner.close();
    }
} 
    

