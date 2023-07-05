
import java.util.Scanner;

public class EjercicioRamdom {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        int op;
        int totalPrice=0;
        int quantityTimes=0;

        do {
            System.out.println("Va a llevar pan o torta?, Recuerde que el pan vale 500 y la torta vale 2000");
            String decision = reading.nextLine();
            quantityTimes=quantityTimes+1;
            if (decision.equals("pan")) {
                totalPrice=totalPrice+500;
                System.out.println("Compraste un pan");
            }
            else if(decision.equals("torta")){
                totalPrice=totalPrice+2000;
                System.out.println("Compraste un torta");
            }
            else{
                System.out.println("Su respuesta no se capturo correctamente");
                quantityTimes=quantityTimes-1;
            }

            System.out.println("Quieres volver a comprar un producto? si=1, no=2");
            op=reading.nextInt();
            reading.nextLine();
        } while (op==1);

        System.out.println("El valor total a pagar es: "+totalPrice+" y el numero de productos que compro fueron: "+quantityTimes);
        System.out.println("Con cuanto va a pagar");
        double pay=reading.nextDouble();
        double changePay= pay-totalPrice;
        System.out.println("Sus vueltos son: "+changePay);

        reading.close();
    }
    
}