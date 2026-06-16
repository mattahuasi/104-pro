import java.util.Scanner;

class Ejercicio07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra:");
        double monto = leer.nextDouble();
        double descuento;

        if (monto > 100) {
            descuento = monto * 0.10;
        } else {
            descuento = monto * 0.02;
        }

        double total = monto - descuento;
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: " + total);

        leer.close();
    }
}
