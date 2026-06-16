import java.util.Scanner;

class ImpresionDigital {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de páginas: ");
        int paginas = teclado.nextInt();

        System.out.print("Ingrese el tipo de cliente (empresa o particular): ");
        String tipoCliente = teclado.next();

        if (paginas < 0) {
            System.out.println(
                "Error: La cantidad de páginas no puede ser negativa."
            );
        } else {
            double tarifa;
            if (paginas <= 200) {
                tarifa = 0.60;
            } else {
                tarifa = 0.45;
            }

            double subtotal = paginas * tarifa;
            double descuento;

            if (tipoCliente.equalsIgnoreCase("empresa")) {
                descuento = subtotal * 0.08;
            } else {
                descuento = 0.0;
            }

            double costoTotal = subtotal - descuento;
            System.out.println("Costo total: " + costoTotal + " Bs");
        }

        teclado.close();
    }
}
