import java.util.Scanner;

public class Ejercicio102 {
    
    public static void main(String[] args) {
        
        int horasExtra = 0 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la tarifa por horas: ");
        int tarifa = scanner.nextInt();

        System.out.print("Digite las horas trabajadas: ");
        int horas = scanner.nextInt();

        if(horas >= 40){

            horasExtra = horas - 40;
            
            double tarifaI = tarifa * 40;

            double tarifaExtra = tarifa + (tarifa * 25/100);

            double tarifaTotal = (tarifaExtra * horasExtra) + tarifaI;

            System.out.println(tarifaTotal);
        }else{

            double tarifaTotal = horas * tarifa;

            System.out.println(tarifaTotal);
        }

        scanner.close();
    }
}