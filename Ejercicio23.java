import java.util.Scanner;
import java.util.Random;
public class Ejercicio23{
    static int numero_aleatorio,n1,n2,n3,x=0,y=9,var1,var2,var3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        n1 = Generarnumero();
        n2 = Generarnumero();
        n3 = Generarnumero();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        scanner.close();
    }
    public static int Generarnumero(){
        Random aleatorio = new Random();
        int x = 0;
        int y = 9;

        numero_aleatorio = aleatorio.nextInt(y-x+1);
        return numero_aleatorio;
    }

    public static void verificar(){
        
    }
}