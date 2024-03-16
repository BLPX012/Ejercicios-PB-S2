import java.util.Scanner;
public class Ejercicio51 {
    private double base;
    private double altura;


    public Ejercicio51(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite la altura: ");
        double altura = scanner.nextDouble();

        Ejercicio51 rectangulo = new Ejercicio51(base, altura);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        scanner.close();
    }
}
