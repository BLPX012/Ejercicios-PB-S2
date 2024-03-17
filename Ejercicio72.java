import java.util.Scanner;
public class Ejercicio72 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new  Scanner(System.in);
        int resultadofinal=0;

        System.out.println("Digite la tarifa por horas");
        int tarifaxhora = scanner.nextInt();
        
        System.out.println("Digite la cantidad de horas trabajadas");
        int horas = scanner.nextInt();

        if(horas >= 40){
            int resta = horas - 40;
            int resta2= horas - resta;
            int resultado2 = resta * 50/100;
            int resultado = tarifaxhora * resta2;
            resultadofinal = resultado +resultado2;


        }else{
            resultadofinal = tarifaxhora * horas;
        }

        System.out.println("Su pago es de " + resultadofinal);

        scanner.close();
    }
}
