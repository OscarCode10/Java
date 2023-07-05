package chanllenger.mainChallenge2;

import chanllenger.healthChallenge2.Person2;

public class Start2 {
    public static void main(String[] args) {
        Person2 person=new Person2();

        person.requestData();
        person.showPerson();
        person.mayoressAge();
        
        String weighString=person.calculateImc(null);
        if (weighString.equals("PESOBAJO")) {
            System.out.println("Su peso es bajo");
        }
        else if(weighString.equals("PESOIDEAL")){
            System.out.println("Su peso es el ideal");
        }
        else if(weighString.equals("SOBREPESO")){
            System.out.println("Su peso es alto");
        }
    }
}
