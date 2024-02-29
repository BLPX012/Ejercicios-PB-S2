import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros;
        numeros = new int[3];

        for (int i = 0; i <=3; i++) {
            System.out.println("Digite el numero "+i);
            numeros[i]= scanner.nextInt();
        }

        double media_aritmetica =( numeros[1]+ numeros[2]+ numeros[3])/3;

        System.out.println("La media aritmetica es: "+media_aritmetica);
        scanner.close();
    }
}
