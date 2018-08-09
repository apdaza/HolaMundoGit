package holamundo;
import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Hola " + nombre);
    }
    
}
