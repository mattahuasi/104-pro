import java.util.Scanner;

class Ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double X1, Y1, X2, Y2, X3, Y3;

        System.out.println("Ingrese el valor de X1: ");
        X1 = leer.nextDouble();
        System.out.println("Ingrese el valor de Y1: ");
        Y1 = leer.nextDouble();
        System.out.println("Ingrese el valor de X2: ");
        X2 = leer.nextDouble();
        System.out.println("Ingrese el valor de Y2: ");
        Y2 = leer.nextDouble();
        System.out.println("Ingrese el valor de X3: ");
        X3 = leer.nextDouble();
        System.out.println("Ingrese el valor de Y3: ");
        Y3 = leer.nextDouble();

        double D1 = Math.sqrt(Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2));
        double D2 = Math.sqrt(Math.pow(X2 - X3, 2) + Math.pow(Y2 - Y3, 2));
        double D3 = Math.sqrt(Math.pow(X3 - X1, 2) + Math.pow(Y3 - Y1, 2));
        double perimetro = D1 + D2 + D3;

        System.out.println(
            "El perímetro del triángulo formado por los puntos es: " + perimetro
        );

        leer.close();
    }
}
