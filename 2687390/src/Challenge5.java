import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        String name, surname;
        System.out.println("Ingrese su nombre");
        name = reading.nextLine();
        System.out.println("Ingrese su apellido");
        surname = reading.nextLine();
        
        int longName = name.length();
        int longSurname = surname.length();
        String fullName = name.toUpperCase() +" "+ surname.toLowerCase();
        String letter = name.substring(0, 2);

        System.out.println("Su nombre es: "+name.toUpperCase()+" y su apellido es: "+surname.toLowerCase()+
        ", su nombre completo es: "+fullName+"El numero de letras del nombre son: "+longName+" y el del apellido son: "+
        longSurname+"Su apellido junto a sus dos primeras letras del nombre son: "+letter+surname);


        reading.close();


    }
}
