import java.util.Scanner;

class FacturaAgua {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el consumo mensual en m3: ");
        double consumo = teclado.nextDouble();

        System.out.print("Ingrese la edad del titular: ");
        int edad = teclado.nextInt();

        if (consumo < 0) {
            System.out.println("Error: El consumo no puede ser negativo.");
        } else {
            double tarifa;
            if (consumo <= 30) {
                tarifa = 2.50;
            } else {
                tarifa = 4.20;
            }

            double subtotal = consumo * tarifa;
            double descuento;

            if (edad >= 65) {
                descuento = 15.0;
            } else {
                descuento = 0.0;
            }

            double montoFinal = subtotal - descuento;
            System.out.println("Monto final a pagar: " + montoFinal + " Bs");
        }

        teclado.close();
    }
}
