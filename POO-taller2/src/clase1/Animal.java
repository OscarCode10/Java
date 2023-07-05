package clase1;

import java.util.Scanner;

public class Animal {
    //ATRIBUTOS
    private String name;
    private int age;

    //Método u operaciones

    Scanner reading=new Scanner(System.in);

    //Método constructor
    public Animal(){//Constructor vacío o por defecto
    }
    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Animal(String name, String tipo){
        
    }

    //Métodos accesores
    public int getAge(){//Método get o getter
        return age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){//Métodor set o setter
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    /*public void registerAnimal(){ metodo sin parametros
        cuerpo método
        System.out.println("Ingrese el nombre del animal");
        name=reading.nextLine();   
        System.out.println("Ingrese la edad del animal");
        age=reading.nextInt();
    }*/
    //método con parametros
    public void registerAnimal(String n, int e){
        //cuerpo método
        name=n;
        age=e;
    }
    public void showAnimal(){
        System.out.println("El nombre de su animal es: "+name+" y su edad es: "+age);
    }
    public int doubleAge(int age){
        int duplicate=age*2;
        return duplicate;
    }
}
