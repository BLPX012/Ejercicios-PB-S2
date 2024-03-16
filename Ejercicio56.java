import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite  los segundos a convertir: ");
        int segundos= scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos %3600) / 60;
        int segundos2= segundos %60;
        
        System.out.println("Tiempo en horas, minutos, segundos: ");
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos2);
        scanner.close();
    }
    
}