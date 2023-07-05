package polimorfismoChallenge4y5;

public class Circle extends Figure{
    
    private double radio;
    private double pi = 3.1416;
    private double areaC;

    
    public double getAreaC(){
        return areaC;
    }
    public double getRadio(){
        return radio;
    }
    public double getPi(){
        return pi;
    }
    public void setAreaC(double areaC) {
        this.areaC=areaC;
    }
    public void setRadio(double radio) {
        this.radio=radio;
    }
    public void setPi(double pi){
        this.pi=pi;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub 
        radio=radio*radio;
        areaC=radio*pi;
        System.out.println("El area del cirle es: "+areaC);
    }
    
}
