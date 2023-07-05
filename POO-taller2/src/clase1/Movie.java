package clase1;


public class Movie {
    private String name;
    private String category;
    private int year;
    private int duration;

    public Movie(){
    }
    public Movie(String name, String category, int year, int duration){
        this.name=name;
        this.category=category;
        this.year=year;
        this.duration=duration;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public int getYear(){
        return year;
    }
    public int getDuration(){
        return duration;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }

    public void showMovie(){
        System.out.println("El nombre de la pelicula es: "+this.name+" y su categoria es: "+this.category+" es del año: "+this.year+" y su duration es: "+this.duration+" minutos");
    }
    public void showMovie(String name, String category, int year, int duration){
        System.out.println("El nombre de la pelicula es: "+this.name+" y su categoria es: "+this.category+" es del año: "+this.year+" y su duration es: "+this.duration+" minutos");
    }
    public void showMovie(int duration, String name, String category, int year){
        System.out.println("El nombre de la pelicula es: "+this.name+" y su categoria es: "+this.category+" es del año: "+this.year+" y su duration es: "+this.duration+" minutos");
    }
}
