import java.util.Scanner;

class MatriculaUniversitaria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de materias: ");
        int materias = teclado.nextInt();

        System.out.print("Ingrese su promedio académico: ");
        double promedio = teclado.nextDouble();

        if (materias < 0) {
            System.out.println(
                "Error: La cantidad de materias no puede ser negativa."
            );
        } else {
            double tarifa;

            if (materias <= 4) {
                tarifa = 250.0;
            } else if (materias <= 7) {
                tarifa = 220.0;
            } else {
                tarifa = 200.0;
            }

            double subtotal = materias * tarifa;
            double descuento;

            if (promedio >= 85) {
                descuento = subtotal * 0.15;
            } else {
                descuento = 0.0;
            }

            double pagoFinal = subtotal - descuento;
            System.out.println("Pago final: " + pagoFinal + " Bs");
        }

        teclado.close();
    }
}
