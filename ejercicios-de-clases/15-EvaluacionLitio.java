import java.util.Scanner;

class EvaluacionLitio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el porcentaje de avance: ");
        double porcentajeAvance = leer.nextDouble();

        if (porcentajeAvance >= 90 && porcentajeAvance <= 100) {
            System.out.println("Finalizado");
        } else if (porcentajeAvance >= 70 && porcentajeAvance < 90) {
            System.out.println("Muy Avanzado");
        } else if (porcentajeAvance >= 50 && porcentajeAvance < 70) {
            System.out.println("En Desarrollo");
        } else if (porcentajeAvance >= 20 && porcentajeAvance < 50) {
            System.out.println("Inicial");
        } else if (porcentajeAvance >= 0 && porcentajeAvance < 20) {
            System.out.println("Retrasado");
        } else {
            System.out.println(
                "Porcentaje de avance inválido. Debe estar entre 0 y 100."
            );
        }

        leer.close();
    }
}
