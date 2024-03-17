import java.util.Scanner;

public class Ejercicio83 {
    
    public static void main(String[] args) {
        int suma=0,nota;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i<3;i++){
            System.out.println("Digite la " + (i+1) + " nota");
            nota = scanner.nextInt();
            suma+= nota;
        }
        double promedio = suma/3;

        if(promedio>= 7){
            System.out.println("APROVADO");
        }else{
            System.out.println("DESAPROBADO,SIGUA ESTUDIANDO");
        }

        scanner.close();
    }
}
