import java.util.Scanner;

public class Ejercicio111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número de día (1-7): ");
        int numeroDia = scanner.nextInt();
        
        String nombreDia = obtenerNombreDia(numeroDia);
        
        if (nombreDia != null) {
            System.out.println("El día correspondiente al número " + numeroDia + " es: " + nombreDia);
        } else {
            System.out.println("Número de día inválido. Por favor ingresa un número entre 1 y 7.");
        }
        
        scanner.close();
    }
    
    public static String obtenerNombreDia(int numeroDia) {
        String nombreDia = null;
        switch(numeroDia) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miércoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
        }
        return nombreDia;
    }
}