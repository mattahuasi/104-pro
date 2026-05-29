import java.util.Scanner;

class PotenciaRaiz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, cuadrado, cubo, raizCuadrada, raizCubica;

        System.out.print("Ingrese un número: ");
        x = entrada.nextDouble();

        cuadrado = Math.pow(x, 2);
        cubo = Math.pow(x, 3);

        raizCuadrada = Math.sqrt(x);
        raizCubica = Math.cbrt(x);

        System.out.println("El número ingresado es: " + x);
        System.out.println("El cuadrado de " + x + " es: " + cuadrado);
        System.out.println("El cubo de " + x + " es: " + cubo);
        System.out.println("La raíz cuadrada de " + x + " es: " + raizCuadrada);
        System.out.println("La raíz cúbica de " + x + " es: " + raizCubica);

        entrada.close();
    }
}
