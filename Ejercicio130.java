import java.util.Scanner;

public class Ejercicio130 {
    
    public static void main(String[] args) {
        int meses = 0;

        double interes = 0,pago=0,pagofinal=0,interesini;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuanto es el monto a pagar por mes");
        double monto = scanner.nextDouble();

        System.out.println("Durante 12(1) o 24 meses(2)?");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                
             interesini= monto * 2 / 100;
            interes=interesini;

            for (int i = 1; i < 12; i++) {
                
                pago = monto + interes;

                System.out.println("El " + i + "su pago es de " + pago + " contando los intereses");
                interes += interesini ;
                pagofinal += pago;
            }

                break;
        
            case 2:
                
            interesini= monto * 2 / 100;
            interes=interesini;

            for (int i = 1; i < 24; i++) {
                
                pago = monto + interes;

                System.out.println("El " + i + "su pago es de " + pago + " contando los intereses");
                interes += interesini ;
                pagofinal += pago;
            }


        }
        scanner.close();
    }
}
