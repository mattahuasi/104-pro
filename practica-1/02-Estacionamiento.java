import java.util.Scanner;

class Estacionamiento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese las horas estacionadas: ");
        int horas = teclado.nextInt();

        System.out.print("Ingrese el tipo de cliente (normal o frecuente): ");
        String tipoCliente = teclado.next();

        if (horas < 0) {
            System.out.println("Error: Las horas no pueden ser negativas.");
        } else {
            double tarifa;
            if (horas <= 5) {
                tarifa = 8.0;
            } else {
                tarifa = 6.0;
            }

            double subtotal = horas * tarifa;
            double descuento;

            if (tipoCliente.equalsIgnoreCase("frecuente")) {
                descuento = subtotal * 0.10;
            } else {
                descuento = 0.0;
            }

            double totalPagar = subtotal - descuento;
            System.out.println("Total a pagar: " + totalPagar + " Bs");
        }

        teclado.close();
    }
}
