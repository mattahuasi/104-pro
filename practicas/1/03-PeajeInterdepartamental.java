import java.util.Scanner;

class PeajeInterdepartamental {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el peso del vehículo en toneladas: ");
        double peso = teclado.nextDouble();

        System.out.print("¿Posee pase frecuente? (si o no): ");
        String paseFrecuente = teclado.next();

        if (peso <= 0) {
            System.out.println("Error: El peso debe ser mayor a cero.");
        } else {
            double peaje;
            if (peso <= 4) {
                peaje = 25.0;
            } else {
                peaje = 45.0;
            }

            double descuento;
            if (paseFrecuente.equalsIgnoreCase("si")) {
                descuento = 5.0;
            } else {
                descuento = 0.0;
            }

            double montoPagar = peaje - descuento;
            System.out.println("Monto final a pagar: " + montoPagar + " Bs");
        }

        teclado.close();
    }
}
