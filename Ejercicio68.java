import java.util.Scanner;

public class Ejercicio68 {
    
    public static void main(String[] args) {
        int suma,axu,sumatotal=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un numero postivo: ");
        int numero = scanner.nextInt();

        for(int e = 1; e <numero; e++){
            suma=1;
            axu=1;
        for(int i = 0;i<e;i++){
            suma += axu * (suma);
            System.out.println(suma);
            axu++;
        }
        sumatotal+=suma;
        System.out.println(sumatotal + "__________");
    }

    System.out.println(sumatotal + "___final___");
    scanner.close();
}
}
    