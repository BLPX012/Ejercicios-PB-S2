import java.util.Scanner;

public class Ejercicio91 {

    String nombre;
    String apellido;
    int edad;
    int numero;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el nombre");
        String nombre = scanner.next();
        System.out.println("Digite el apellidos");
        String apellido = scanner.next();
        System.out.println("Digite la edad ");
        int edad = scanner.nextInt();
        System.out.println("Digite el numero");
        int numero  = scanner.nextInt();

        Ejercicio91 persona = new Ejercicio91(nombre,apellido,edad,numero);

        persona.mostrar();

        scanner.close();
    }

    public Ejercicio91(String nombre,String apellido, int edad, int numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numero = numero;
    }

    public void mostrar(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(numero);
    }
}