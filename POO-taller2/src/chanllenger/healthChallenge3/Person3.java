package chanllenger.healthChallenge3;

import java.util.Scanner;

public class Person3 {
    private String typeDoc;
    private int document;
    private String name;
    private String surname;
    private double weight;
    private double height;
    private int age;
    private String gender;

    //Método Constructor
    public Person3(){
    }
    public Person3(String typeDoc, int document, String name, String surname, double weight, double height, int age, String gender){
        this.typeDoc=typeDoc;
        this.document=document;
        this.name=name;
        this.surname=surname;
        this.weight=weight;
        this.height=height;
        this.age=age;
        this.gender=gender;
    }
    //Getters
    public String getTypeDoc(){   
        return typeDoc;
    }
    public int getDocument(){
        return document;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    //Setters
    public void setTypeDoc(String typeDoc) {
        this.typeDoc=typeDoc;
    }
    public void setDocument(int document){
        this.document=document;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }


    Scanner reading=new Scanner(System.in);

    public void requestData(){
        System.out.println("Ingrese su tipo de documento");
        typeDoc=reading.nextLine();
        System.out.println("Ingrese su numero de documento");
        document=reading.nextInt();
        reading.nextLine();
        System.out.println("Ingrese su nombre");
        name=reading.nextLine();
        System.out.println("Ingrese su apellido");
        surname=reading.nextLine();
        System.out.println("Ingrese su peso en kilogramos");
        weight=reading.nextDouble();
        System.out.println("Ingrese su estatura en metros");
        height=reading.nextDouble();
        System.out.println("Ingrese su edad");
        age=reading.nextInt();
        reading.nextLine();
        System.out.println("Ingrese su sexo");
        gender=reading.nextLine();
    }

    public void showPerson() {
        System.out.println("Su tipo de documento es: "+typeDoc);
        System.out.println("Su numero de documento es: "+document);
        System.out.println("Su nombre es: "+name);
        System.out.println("Su apellido es: "+surname);
        System.out.println("Su peso es: "+weight+"kg");
        System.out.println("Su altura es: "+height+"m");
        System.out.println("Su edad es: "+age+"años");
        System.out.println("Su sexo es: "+gender);
    }
    public String calculateImc(String weightString) {
        weightString="";
        double height2= Math.pow(height,2);
        double weightNow= weight/height2;
        if (weightNow<20) {
            weightString="PESOBAJO";
        }
        else if(weightNow>=20 && weightNow<=25){
            weightString="PESOIDEAL";
        }
        else if(weightNow>25){
            weightString="SOBREPESO";
        }
        System.out.println(weightString);
        return weightString;
        
    }
    public void mayoressAge(){
        System.out.println("Su edad es: "+age);
        if (age<18) {
            System.out.println("por lo tanto, usted es menor de edad");
        } else {
            System.out.println("por lo tanto, usted es mayor de edad");
        }
    }
}