import java.util.Scanner;

public class ClassNote {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de notas");
        int c = reading.nextInt();
        double notes[] = new double[c];
        double add=0;
        
        for (int p = 0; p < notes.length; p++) {
            System.out.println("Digita tu nota: "+p);
            notes[p]=reading.nextInt();
            add=add+notes[p];
        }
        double prom = add/c;
        System.out.println("El promedio de la nota es: "+prom); 
        if (prom<3) {
            System.out.println("Reprobaste");
        }
        else if(prom>=3 && prom<=4){
            System.out.println("Pasaste raspando");
        }
        else{
            System.out.println("Aprobaste con buenos resultados");
        }

        reading.close();
    }
}
