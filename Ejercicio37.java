import java.util.Scanner;
public class Ejercicio37 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribas las horas: ");
        int horas = scanner.nextInt();
        System.out.println("Escriba los minutos: ");
        int minutes = scanner.nextInt();

        
        

        if(minutes>=10){

            double rest1 = (horas+1 ) *15.00;
            System.out.println("El cobre es de " + rest1);

        }else{
            double rest1 = horas *15.00;
            System.out.println("El cobre es de: " + rest1);
        }
        scanner.close();

    }
    
}