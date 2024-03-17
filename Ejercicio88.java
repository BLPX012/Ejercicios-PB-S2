import java.util.Scanner;;
public class Ejercicio88 {
    
    public static void main(String[] args) {
        double suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        for(int i = 0;i<3;i++){

            System.out.println("Digite el " + i + " voltaje");
            double voltaje = scanner.nextDouble();
            
            suma += voltaje;
        }
            suma =suma/3;
        
        if(suma>220){
            System.out.println("PELIGRO ALTO VOLTAJE");
        }else if(suma>115 && suma<= 220){
            System.out.println("VOLTAJE ALTO");
        }else{
            System.out.println("VOLTAJE CORRECTO");
        }

        scanner.close();
    }
}
