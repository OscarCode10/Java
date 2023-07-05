import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        int f1;
        System.out.println("ingrese los grados F°");
        f1 = lectura.nextInt();
        
        float result = ( f1 - 32 )* 5/9;

        System.out.println("Los grados c° son: "+ result);



        lectura.close();
    

        

    }
}
