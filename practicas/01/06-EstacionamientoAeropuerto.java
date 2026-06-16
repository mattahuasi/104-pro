import java.util.Scanner;

class EstacionamientoAeropuerto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese las horas estacionadas: ");
        int horas = teclado.nextInt();

        System.out.print("Ingrese el tipo de vehículo: ");
        String vehiculo = teclado.next();

        if (horas < 0) {
            System.out.println("Error: Las horas no pueden ser negativas.");
        } else {
            int tarifa;

            if (horas <= 3) {
                tarifa = 10;
            } else if (horas <= 10) {
                tarifa = 8;
            } else {
                tarifa = 6;
            }

            double subtotal = horas * tarifa;
            double descuento;

            if (vehiculo.equalsIgnoreCase("motocicleta")) {
                descuento = subtotal * 0.20;
            } else {
                descuento = 0.0;
            }

            double totalPagar = subtotal - descuento;
            System.out.println("Total a pagar: " + totalPagar + " Bs");
        }

        teclado.close();
    }
}
