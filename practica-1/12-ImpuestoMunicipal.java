import java.util.Scanner;

class ImpuestoMunicipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor comercial del inmueble: ");
        double valor = teclado.nextDouble();

        System.out.print(
            "Ingrese la zona (residencial, comercial o industrial): "
        );
        String zona = teclado.next();

        System.out.print("¿El propietario es adulto mayor? (si o no): ");
        String adultoMayor = teclado.next();

        if (valor <= 0) {
            System.out.println("Error: Valor comercial no válido.");
        } else {
            double porcentaje = 0;

            if (zona.equalsIgnoreCase("residencial")) {
                if (valor <= 500000) {
                    porcentaje = 0.015;
                } else {
                    porcentaje = 0.02;
                }
            } else if (zona.equalsIgnoreCase("comercial")) {
                if (valor <= 1000000) {
                    porcentaje = 0.025;
                } else {
                    porcentaje = 0.03;
                }
            } else if (zona.equalsIgnoreCase("industrial")) {
                if (valor <= 2000000) {
                    porcentaje = 0.035;
                } else {
                    porcentaje = 0.04;
                }
            }

            double impuestoBase = valor * porcentaje;
            double descuento;

            if (adultoMayor.equalsIgnoreCase("si")) {
                descuento = impuestoBase * 0.10;
            } else {
                descuento = 0.0;
            }

            double impuestoFinal = impuestoBase - descuento;
            System.out.println("Impuesto final: " + impuestoFinal + " Bs");
        }

        teclado.close();
    }
}
