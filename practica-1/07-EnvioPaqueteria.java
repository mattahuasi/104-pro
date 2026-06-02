import java.util.Scanner;

class EnvioPaqueteria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = teclado.nextDouble();

        System.out.print("Ingrese el destino (nacional o internacional): ");
        String destino = teclado.next();

        if (peso <= 0) {
            System.out.println("Error: El peso debe ser mayor a cero.");
        } else {
            double tarifa;

            if (peso <= 5) {
                tarifa = 15.0;
            } else if (peso <= 20) {
                tarifa = 12.0;
            } else {
                tarifa = 10.0;
            }

            double subtotal = peso * tarifa;
            double recargo;

            if (destino.equalsIgnoreCase("internacional")) {
                recargo = subtotal * 0.25;
            } else {
                recargo = 0.0;
            }

            double costoTotal = subtotal + recargo;
            System.out.println("Costo total: " + costoTotal + " Bs");
        }

        teclado.close();
    }
}
