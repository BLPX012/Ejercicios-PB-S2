import java.util.Scanner;
public class Ejercicio90 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite hasta que numero primo desea llegar en el vector");
        int Cvector = scanner.nextInt();

        if(Cvector % 3 == 0  || Cvector % 5 ==0  || Cvector % 7 ==0 || Cvector == 2 || Cvector == 3 || Cvector == 5 || Cvector == 7){
            System.out.println("DIGITE UN NUMERO PRIMO VALIDO");
            System.exit(1);
        }


        System.out.println("Digite hasta que numero primo desea llegar en la matriz");
        int Cmatriz = scanner.nextInt();

        if(Cmatriz % 3 == 0  || Cvector % 5 ==0  || Cvector % 7 ==0 || Cvector == 2 || Cvector == 3 || Cvector == 5 || Cvector == 7){
            System.out.println("DIGITE UN NUMERO PRIMO VALIDO");
            System.exit(1);
        }
        
        int[] vector = generadorvector(Cvector);

        for(int i = 0;i<vector.length;i++){
            System.out.println("__________________________________________________________________");
            System.out.println(vector[i]);
            System.out.println("_____________________________________________________________");
        }

        System.out.println("La cantidad de numeros primos en el vector son de:  " + vector.length);
        
        scanner.close();
    }

    public static int[] generadorvector(int Cantidad){
        int c=0;
        int[] vector = new int[Cantidad];

        for(int i = 0 ; i <= Cantidad;i++){
            
            if( i % 2 !=0 && i % 3 != 0  && i % 5 !=0  && i % 7 !=0 || i == 2 || i == 3 || i == 5 || i == 7 ){
                vector[c] = i;
                c++;
            }

        }
        int[] vectorr = elimanarceros(vector);

        return vectorr;
    }

    public static int[] elimanarceros(int[] array){
        int length0 = cantidadCeros(array);
        int[] array0 = new int[length0];
        int c=0;
        for(int i = 0;i<array.length;i++){

            if(array[i] != 0){
                array0[c] = array[i];
                c++;
            }
        }

        return array0;
    }

    public static int cantidadCeros(int[] array){
        int c=0;
        for (int i = 0; i < array.length; i++) {
            
            if(array[i] != 0){
                c++;
            }
        }
        return c;
    }
}
