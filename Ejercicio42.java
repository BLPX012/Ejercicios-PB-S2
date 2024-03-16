import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba la cantidad de volteos necesitados");
        double volteos = scanner.nextDouble();
        int c=0;
        double naranjas = 0.05;
        
        while (volteos>= naranjas) {
            
            naranjas+=0.05;
            c++;
        }

        double toneladas = c * 6;
        System.out.println("Los cantidad de naranjas necesitadas son: " + c);
        if(toneladas>=1000){
        System.out.println("Las toneladas necesarias son: " + toneladas);
        }else{
            String toneladasstring = Double.toString(toneladas);
            String parte = toneladasstring.substring(0, toneladasstring.length() -2);
            System.out.println("Las toneladas necesarias son "+ "0." + parte);
        }
        scanner.close();
    }
    
}