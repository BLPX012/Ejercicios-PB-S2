import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha en formato AAAA MM DD (por ejemplo, 2012 01 23):");
        String fechaString = scanner.nextLine();

        SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy MM dd");
        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd MMMM 'de' yyyy");

        try {
            Date fecha = formatoEntrada.parse(fechaString);
            String fechaFormateada = formatoSalida.format(fecha);
            System.out.println("Fecha en formato texto: " + fechaFormateada);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Asegúrese de ingresar la fecha en el formato correcto (AAAA MM DD).");
        }
        scanner.close();
    }
}