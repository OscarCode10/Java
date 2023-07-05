import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        double weight, month;
        System.out.println("Vamos a aplicarle a el bebé una vacuna, va a depender de su peso y sus meses");
        System.out.println("Ingresa el peso del bebé");
        weight = reading.nextDouble();
        System.out.println("Ingresa los meses");
        month = reading.nextDouble();
        
        double vaccine = ((weight+10)/(month*10))*8;

        System.out.println("La dosis de su vacuna será: "+vaccine);

        reading.close();

    }
}
