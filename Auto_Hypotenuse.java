import java.util.Scanner;

public class Auto_Hypotenuse {
    public static void main(String[] args) {
        double x;
        double y;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el cateto 1");
        x = scanner.nextDouble();
        System.out.println("Introduce el cateto 2");
        y = scanner.nextDouble();
        result = Math.sqrt((x*x)+(y*y));
        System.out.println("La hipotenusa es: "+result);
        scanner.close();
    }   
}
