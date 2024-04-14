import java.util.Scanner;

public class Ejercicio105 {
    
    public static void main(String[] args) {
        double promedio = 0;
        Scanner scanner = new Scanner(System.in);

    

        for(int i = 0; i < 4 ; i++){

            System.out.println("Escriba la " + (i+1) + " nota");
            double nota = scanner.nextDouble();

            if( nota % 1 == 0){
                System.out.println("Escriba numeros decimales");
                return;
            }

            promedio += nota;
        }

        promedio = promedio/4;

        if(promedio >= 14.5){

            System.out.println("APROBADO");

        }else if(promedio < 14.5 && promedio >= 10){

            System.out.println("SUPLETORIO");

        }else{
            System.out.println("REPROBADO");
        }
        scanner.close();
    }
}