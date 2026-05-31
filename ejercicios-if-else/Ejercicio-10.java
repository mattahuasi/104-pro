import java.util.Scanner;

class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra:");
        double monto = leer.nextDouble();
        double porcentaje;

        if (monto < 500) {
            porcentaje = 0.0;
        } else {
            if (monto <= 1000) {
                porcentaje = 0.05;
            } else {
                if (monto <= 7000) {
                    porcentaje = 0.11;
                } else {
                    if (monto <= 15000) {
                        porcentaje = 0.18;
                    } else {
                        porcentaje = 0.25;
                    }
                }
            }
        }

        double descuento = monto * porcentaje;
        double total = monto - descuento;

        System.out.println("El descuento es de: " + descuento);
        System.out.println("Total a pagar: " + total);

        leer.close();
    }
}
