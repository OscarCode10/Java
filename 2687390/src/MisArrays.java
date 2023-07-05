import java.util.Scanner;

public class MisArrays {
    public static void main(String[] args) {
        //Declaracion e inicialización de un array
        int [] vector1;
        vector1=new int[10];
        //int [] vector=new int[10]
        //Rellenar vector
        int[]vector={30,50,25,85,12,6,32,41,23,63};
        vector1[6]=32;

        /*for (int p=0;p<vector.length;p++) {
            System.out.println(vector[p]+" ");
        }*/
        for (int i : vector) {
            System.out.println(i);
        }
        Scanner reading = new Scanner(System.in);
        //Rellenar el array de forma dinámica
        for (int p=0;p<vector.length;p++) {
            System.out.println("Digite de la posicion: "+p);
            vector[p]=reading.nextInt();
        }

        for (int i : vector) {
            System.out.println(i);
        }

        reading.close();

    }
}
