public class Ejercicio62 {
    
    public static void main(String[] args) {
        int [] array = generador();
        int suma=0,mayor=0,menor=30;
        for(int i = 0; i<array.length;i++){

            suma += array[i];

            if(mayor<array[i]){
                mayor = array[i];
            }
            if(menor>array[i]){
                menor = array[i];
            }
        }

        double division = suma/6;

        System.out.println("La media del clima es de " + division);
        System.out.println("El clmia mas alto fue de " + mayor);
        System.out.println("El clmia mas bajo fue de " + menor);
    }

    public static int[] generador(){

    int[] array = new int[6];

        for(int i = 0; i< array.length; i++){
            double number = Math.random()*30;

            array[i] = (int) Math.round(number);
        }
    return array;
    }
}

