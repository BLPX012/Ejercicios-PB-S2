import java.util.Scanner;
public class Ejercicio146 {
    
    public static void main(String[] args) {
        int c=0,numeroc=0,z=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero limite de la serie Fibonacci");
        int numero = scanner.nextInt();

        for (int i = 1; i < numero; i++) {
            
        

            numeroc = c+z;

            z=c;
            c=numeroc;

            if(numero == numeroc){
                System.out.println(numeroc);
                break;
            }else if(numero<=  numeroc){

                System.out.println("El numero que mas se aproxima a el numero de serie que digito es de:");

                System.out.println(numeroc);

                break;
            }else{
                System.out.println(numeroc);
            }
        }

        scanner.close();
    }
}
