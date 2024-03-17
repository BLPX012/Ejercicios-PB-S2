import java.util.Scanner;
public class Ejercicio75 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el año: ");
        int año = scanner.nextInt();
        if(año%4 == 0 && año%100 == 0 && año%400 == 0){
            System.out.println("Es año bisiteso ");
        }else{
            System.out.println("No es un año bisiesto");
        }

        scanner.close();
        
    }
}
