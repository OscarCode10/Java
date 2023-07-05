package polimorfismoChallenge4y5;

import java.util.Scanner;

public class ExecuteChallenge4{
    public static void main(String[] args) {
        Scanner reading=new Scanner(System.in);
        String op="";
        do {
            System.out.println("Vamos a calcular el area de figuras básicas");
            System.out.println("Elige entre: Cuadrado, Circulo, Triangulo y Rectangulo,(Escribelo en minusculas)");
            String figure = reading.nextLine();
            if (figure.equals("cuadrado")) {
                System.out.println("Ingrese el radio del cuadrado");
                float side=reading.nextFloat();
                Square areaS=new Square();
                areaS.setSide(side);
                areaS.calculateArea();
            }
            else if(figure.equals("circulo")){
                System.out.println("Ingrese el radio del circulo");
                double radio=reading.nextDouble();
                Circle areaC=new Circle();
                areaC.setRadio(radio);
                areaC.calculateArea();
            }
            else if(figure.equals("triangulo")){
                System.out.println("Ingrese la base del triángulo");
                float base=reading.nextFloat();
                System.out.println("Ingre la altura del triángulo");
                float height=reading.nextFloat();
                Triangle areaT=new Triangle();
                areaT.setBaseT(base);
                areaT.setHeightT(height);
                areaT.calculateArea();
            }
            else if(figure.equals("rectangulo")){
                System.out.println("Ingrese la altura del rectángulo");
                float height=reading.nextFloat();
                System.out.println("Ingrese la base del rectángulo");
                float base=reading.nextFloat();
                Rectangle areaR=new Rectangle();
                areaR.setHeightR(height);
                areaR.setBaseR(base);
                areaR.calculateArea();
            }
            else {
                System.out.println("Lo siento, no pudimos enternder su respuesta");
            }
            System.out.println("Quieres volver a intentarlo? (escribir en minusculas)");
            reading.nextLine();
            op=reading.nextLine();
        } while (op.equals("si"));
        System.out.println("Esta bien, que tenga lindo día");
        
        reading.close();
    }
}
