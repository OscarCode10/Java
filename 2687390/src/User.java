import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Ingresar Usuario");
        String user = reading.nextLine();
        System.out.println("Ingresar Contraseña");
        String password = reading.nextLine();

        if(user.equals("Oscar") && password.equals("123")){
            System.out.println("Bienvenido a el sistema");
        }
        else if(user.equals("Oscar")){

            System.out.println("Parece que olvidaste tus crecenciales de acceso");
        }
        else if(password.equals("123")){
            System.out.println("Algo ocurre con tus datos de acceso");
        }
        else{
            System.out.println("Acceso denegado");
        }
        reading.close();
    }
}
