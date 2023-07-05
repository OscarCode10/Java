package chanllenger.healthChallenge3;

import java.util.Scanner;

public class Clerk extends Person3 {
    Scanner readinng=new Scanner(System.in);
    
    //Atributos propios

    private String post;
    private double valueTime=4800;
    private double hoursWorked;
    private String department;
    //Métodos propios

    public void calculateFee() {
        System.out.println("Ingresa que cargo tienes");
        post=reading.nextLine();
        System.out.println("Ingresa de que departamento eres");
        department=reading.nextLine();
        System.out.println("Ingresa cuántas horas trabajaste");
        hoursWorked=reading.nextDouble();
        double totalValue=valueTime*hoursWorked;
        double reteica=(totalValue*0.966)/100;
        double calculateFee = totalValue-reteica;
        System.out.println("Tu tipo de documento es: "+getTypeDoc());
        System.out.println("Tu numero de documento es: "+getDocument());
        System.out.println("Tu nombre es: "+getName());
        System.out.println("Tu apellido es es: "+getSurname());
        System.out.println("Tu cargo es "+post);
        System.out.println("Tus horas trabajadas fueron: "+hoursWorked);
        System.out.println("El valor  por hora es de: "+valueTime+" pesos");
        System.out.println("Tu departamento es: "+department);
        System.out.println("El calculo de los honorarios o horas que te pagaremos son: "+calculateFee+" Pesos");
    }
}
