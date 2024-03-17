import java.util.Scanner;
public class Ejercicio87 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la longitud de un lado del triangulo");
        int lado = scanner.nextInt();

        double area = (lado*lado)*Math.sqrt(3)/4;

        if(area>1000){
            System.out.println("DATOS NO VALIDOS");
        }else{
            System.out.println("El area del triangulo equilatero es de " + area);
        }
        scanner.close();
    }
}
