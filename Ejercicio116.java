
public class Ejercicio116 {

    
    public static void main(String[] args) {
        int suma = 0,multiplicacion=1,c=0,g=1;
        for (int i = 0; i < 1000; i++) {
            
            if( i % 2 == 0){

                suma += i;
            }

            if( c != 50 && i % 2 != 0){
                
                multiplicacion = i * g;

                c+= 2;
                g=multiplicacion;
                System.out.println(multiplicacion);

            }
        }
        System.out.println(multiplicacion);
        System.out.println(suma);
    }
    }