
public class Ejercicio136 {
    public static void main(String[] args) {

        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (true) {
           if (horas<10) {
            System.out.print("0");
           }
           System.out.print(+horas+":");

           if (minutos<10) {
            System.out.print("0");
           }
           System.out.print(+minutos+":");

           if (segundos<10) {
            System.out.print("0");
           }
           System.out.println(+segundos);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            segundos++;

            if (segundos >= 60) {
                segundos = 0;
                minutos++;

                if (minutos >= 60) {
                    minutos = 0;
                    horas++;

                    if (horas >= 24) {
                        horas = 0;
                    }
                }
            }
        }
    }
}
