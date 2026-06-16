import java.util.Scanner;

class Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio de la esfera: ");
        int radio = leer.nextInt();

        double area = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("El area de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);

        leer.close();
    }
}
