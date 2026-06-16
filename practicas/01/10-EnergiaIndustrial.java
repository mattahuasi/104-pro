import java.util.Scanner;

class EnergiaIndustrial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el consumo en kWh: ");
        double consumo = teclado.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        String categoria = teclado.next();

        System.out.print("¿Posee certificación ecológica? (si o no): ");
        String ecologica = teclado.next();

        if (consumo <= 0) {
            System.out.println("Error: Consumo no válido.");
        } else {
            double tarifa = 0;

            if (categoria.equalsIgnoreCase("A")) {
                if (consumo <= 2000) {
                    tarifa = 1.20;
                } else {
                    tarifa = 1.50;
                }
            } else if (categoria.equalsIgnoreCase("B")) {
                if (consumo <= 5000) {
                    tarifa = 1.10;
                } else {
                    tarifa = 1.35;
                }
            } else if (categoria.equalsIgnoreCase("C")) {
                if (consumo <= 10000) {
                    tarifa = 1.00;
                } else {
                    tarifa = 1.25;
                }
            } else {
                System.out.println("Categoría no reconocida.");
                System.exit(0);
            }

            double subtotal = consumo * tarifa;
            double descuento;

            if (ecologica.equalsIgnoreCase("si")) {
                descuento = subtotal * 0.10;
            } else {
                descuento = 0.0;
            }

            double facturaFinal = subtotal - descuento;
            System.out.println("Factura final: " + facturaFinal + " Bs");
        }

        teclado.close();
    }
}
