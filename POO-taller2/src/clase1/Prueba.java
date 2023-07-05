package clase1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) throws Exception {
        Scanner reading=new Scanner(System.in);
        Animal guacamaya=new Animal();
        Movie titanic=new Movie();
        Animal panda = new Animal("Bambú", 10);

        guacamaya.setName("Pancho");
        guacamaya.setAge(8);

        guacamaya.showAnimal();

        System.out.println("El nombre del guacamayo es: "+guacamaya.getName()+" y su edad es "+guacamaya.getAge());


        /*panda.showAnimal();
        
        System.out.println("Ingrese el nombre del animal");
        String name=reading.nextLine();
        System.out.println("Ingrese la edad de del animal");
        int age=reading.nextInt();

        guacamaya.registerAnimal(name, age);//Invocar o llamar un metodo
        guacamaya.showAnimal();

        int duplicate=guacamaya.doubleAge(age);
        System.out.println("La edad dublicada del animal es: "+duplicate);*/

        Movie up=new Movie("up", "Pro", 2009, 230);
        Movie laNocheDelDemonio=new Movie("La noche del demonio", "Terror", 1999, 20);
        up.showMovie();
        up.showMovie("up", "Pro", 2009, 230);
        up.showMovie(230, "up", "Pro", 2009);
        laNocheDelDemonio.showMovie();
        laNocheDelDemonio.showMovie("La noche del demonio", "Terror",  1999, 20);
        laNocheDelDemonio.showMovie(20, "La noche del demonio", "Terror", 1999);
        


        reading.close();
    }    
}
