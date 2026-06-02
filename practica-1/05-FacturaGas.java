import java.util.Scanner;

class FacturaGas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el consumo en m3: ");
        double consumo = teclado.nextDouble();

        System.out.print("Ingrese la edad del titular: ");
        int edad = teclado.nextInt();

        if (consumo < 0) {
            System.out.println("Error: El consumo no puede ser negativo.");
        } else {
            double tarifa;

            if (consumo <= 50) {
                tarifa = 1.80;
            } else if (consumo <= 150) {
                tarifa = 2.50;
            } else {
                tarifa = 3.20;
            }

            double subtotal = consumo * tarifa;
            double descuento;

            if (edad >= 65) {
                descuento = subtotal * 0.08;
            } else {
                descuento = 0.0;
            }

            double montoFinal = subtotal - descuento;
            System.out.println("Monto final: " + montoFinal + " Bs");
        }

        teclado.close();
    }
}
