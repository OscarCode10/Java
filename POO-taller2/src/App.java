import clase1.Animal;
import clase1.Bird;
import clase1.Movie;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal tigre= new Animal();
        Movie minions= new Movie();
        Movie avatar=new Movie();

        avatar.setName("avatar");
        avatar.setCategory("Acción");
        avatar.setYear(2009);
        avatar.setDuration(200);
        System.out.println("El nombre de la pelicula es: "+avatar.getName()+", la categoría de la pelicula es: "+avatar.getCategory()+", el año de la pelicula es: "+avatar.getYear()+" y la duración de la pelicula es: "+avatar.getDuration());

        Bird condorito=new Bird();

        condorito.setName("Condorito");
        condorito.setAge(50);
        condorito.setwingspan("300cm");

        condorito.showBird();
    }
}
