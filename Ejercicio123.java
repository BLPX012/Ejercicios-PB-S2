import java.util.Scanner;

public class Ejercicio123 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int suma =0;
        System.out.println("Capital invertido");
        int capital = scanner.nextInt();

        System.out.println("Interes diario");
        int Interes = scanner.nextInt();

        System.out.println("Dias ");
        int dias = scanner.nextInt();

        for (int i = 0; i < dias; i++) {
            
            suma= capital + Interes;
            
            System.out.println("El capital final en el dia " + (i+1) + " es de " + suma );
        }
        scanner.close();
    }
}