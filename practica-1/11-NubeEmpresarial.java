import java.util.Scanner;

class NubeEmpresarial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el almacenamiento en TB: ");
        double almacenamiento = teclado.nextDouble();

        System.out.print(
            "Ingrese el plan (basico, profesional o corporativo): "
        );
        String plan = teclado.next();

        System.out.print("¿Es cliente VIP? (si o no): ");
        String clienteVIP = teclado.next();

        if (almacenamiento <= 0) {
            System.out.println("Error: Almacenamiento inválido.");
        } else {
            double tarifa = 0;

            if (plan.equalsIgnoreCase("basico")) {
                if (almacenamiento <= 5) {
                    tarifa = 80;
                } else {
                    tarifa = 70;
                }
            } else if (plan.equalsIgnoreCase("profesional")) {
                if (almacenamiento <= 10) {
                    tarifa = 70;
                } else {
                    tarifa = 60;
                }
            } else if (plan.equalsIgnoreCase("corporativo")) {
                if (almacenamiento <= 20) {
                    tarifa = 60;
                } else {
                    tarifa = 50;
                }
            }

            double subtotal = almacenamiento * tarifa;
            double descuento;

            if (clienteVIP.equalsIgnoreCase("si")) {
                descuento = subtotal * 0.18;
            } else {
                descuento = 0.0;
            }

            double pagoMensual = subtotal - descuento;
            System.out.println("Pago mensual final: " + pagoMensual + " Bs");
        }

        teclado.close();
    }
}
