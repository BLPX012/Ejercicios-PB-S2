import java.util.Scanner;

public class Ejercicio41 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su año");
        int anio = scanner.nextInt();

        int rest = 6*anio;
        String number1 = Integer.toString(rest);
        String parte = number1.substring(1);
        char numberchar = number1.charAt(0);

        if(anio>= 17){
            System.out.println(numberchar+ "." + parte +   "Meters is your hair");
        }else{
            System.out.println("0." + rest + " meters is your hair");
        }
        scanner.close();
    }

}