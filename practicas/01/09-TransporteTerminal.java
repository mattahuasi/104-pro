import java.util.Scanner;

class TransporteTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print(
            "Ingrese el destino (La Paz, Cochabamba o Santa Cruz): "
        );
        String destino = teclado.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese el horario (dia o noche): ");
        String horario = teclado.next();

        if (
            destino.equalsIgnoreCase("La Paz") ||
            destino.equalsIgnoreCase("Cochabamba") ||
            destino.equalsIgnoreCase("Santa Cruz")
        ) {
            double precioBase = 0;

            if (destino.equalsIgnoreCase("La Paz")) {
                if (horario.equalsIgnoreCase("dia")) {
                    precioBase = 90;
                } else {
                    precioBase = 110;
                }
            } else if (destino.equalsIgnoreCase("Cochabamba")) {
                if (horario.equalsIgnoreCase("dia")) {
                    precioBase = 80;
                } else {
                    precioBase = 100;
                }
            } else if (destino.equalsIgnoreCase("Santa Cruz")) {
                if (horario.equalsIgnoreCase("dia")) {
                    precioBase = 140;
                } else {
                    precioBase = 170;
                }
            }

            double descuento;

            if (edad >= 60) {
                descuento = precioBase * 0.20;
            } else {
                descuento = 0.0;
            }

            double precioFinal = precioBase - descuento;
            System.out.println("Precio final: " + precioFinal + " Bs");
        } else {
            System.out.println("Error: Destino no válido.");
        }

        teclado.close();
    }
}
