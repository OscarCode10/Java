package clase1;

public class Bird extends Animal{
    //Atributo propio
    private String wingspan;

    //Método constructor
    public Bird(){
    }
    public Bird(String name, int age, String wingspan){
        super(name,age);
        this.wingspan=wingspan;
    }
    //Métodos accesores getters y setters
    public String getwingspan() {
        return wingspan;
    }

    public void setwingspan(String wingspan) {
        this.wingspan = wingspan;
    }
    
    //Métodos propios
    public void showBird(){
        System.out.println("El nombre del animal es: "+getName()+" tiene "+getAge()+" años y la envergadura del ave es: "+this.wingspan);
    }
}
