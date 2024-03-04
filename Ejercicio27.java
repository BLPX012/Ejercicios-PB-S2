import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Eres? : 1.Masculino --- 2.Femenino  --- 3.Otro.");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Bienvenido " + nombre);
                break;
            case 2:
            System.out.println("Bienvenida " + nombre);

            case 3 :
                System.out.println("Dola indeciso");
            default:
                break;
        }
        scanner.close();
    }
}
