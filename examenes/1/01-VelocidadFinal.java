import java.util.Scanner;

class VelocidadFinal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la velocidad inicial (m/s): ");
        double velocidadInicial = leer.nextDouble();

        System.out.print("Ingrese la aceleración (m/s^2): ");
        double aceleracion = leer.nextDouble();

        System.out.print("Ingrese la distancia (m): ");
        double distancia = leer.nextDouble();

        double velocidadFinal = Math.sqrt(
            Math.pow(velocidadInicial, 2) + 2 * aceleracion * distancia
        );

        System.out.println("La velocidad final es: " + velocidadFinal + " m/s");

        leer.close();
    }
}
