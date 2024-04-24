import java.util.Scanner;

public class Ejercicio148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas [][] = new double[5][3];
        int aprovados = 0;
        int aprovoUltimo = 0;
        int aprovoTodos = 0;
        int aprovoMinimoUno = 0;

        System.out.println("Notas del 0.0 hasta el 5.0");

        for(int i=0; i<5; i++){

            for(int j=0; j<3; j++){
                System.out.println("Digita la nota "+(j+1)+ " del "+(i+1)+" estudiante");
                notas [i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            if (notas[0][i] >=3) {
                aprovados++;
            }
        }
        if (aprovados == 3) {
            aprovoTodos++;
        }else if (aprovados == 1) {
            aprovoMinimoUno++;
        }

        if (notas[0][0]<3 && notas[0][1]<3 && notas[0][2]>=3) {
            aprovoUltimo++;
        }

        aprovados = 0;

        for(int i=0; i<3; i++){
            if (notas[1][i] >=3) {
                aprovados++;
            }
        }
        if (aprovados == 3) {
            aprovoTodos++;
        }else if (aprovados == 1) {
            aprovoMinimoUno++;
        }

        if (notas[1][0]<3 && notas[1][1]<3 && notas[1][2]>=3) {
            aprovoUltimo++;
        }

        aprovados = 0;

        for(int i=0; i<3; i++){
            if (notas[2][i] >=3) {
                aprovados++;
            }
        }
        if (aprovados == 3) {
            aprovoTodos++;
        }else if (aprovados == 1) {
            aprovoMinimoUno++;
        }

        if (notas[2][0]<3 && notas[2][1]<3 && notas[2][2]>=3) {
            aprovoUltimo++;
        }

        aprovados = 0;

        for(int i=0; i<3; i++){
            if (notas[3][i] >=3) {
                aprovados++;
            }
        }
        if (aprovados == 3) {
            aprovoTodos++;
        }else if (aprovados == 1) {
            aprovoMinimoUno++;
        }

        if (notas[3][0]<3 && notas[3][1]<3 && notas[3][2]>=3) {
            aprovoUltimo++;
        }

        aprovados = 0;

        for(int i=0; i<3; i++){
            if (notas[4][i] >=3) {
                aprovados++;
            }
        }
        if (aprovados == 3) {
            aprovoTodos++;
        }else if (aprovados == 1) {
            aprovoMinimoUno++;
        }

        if (notas[4][0]<3 && notas[4][1]<3 && notas[4][2]>=3) {
            aprovoUltimo++;
        }

        System.out.println("Estudiantes que aprovaron todos los examenes : "+aprovoTodos);
        System.out.println("Estudiantes que aprovaron almenos uno de los examenes : "+aprovoMinimoUno);
        System.out.println("Estudiantes que solo aprovaron el ultimo examen : "+aprovoUltimo);

        scanner.close();
    }
}