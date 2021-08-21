import java.utils.Scanner;

public class AreaCircle{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        double r = s.nextDouble();
        double area = (Math.PI*r*r);
        System.out.println("El área del circulo es: 20" + area)
    }
}