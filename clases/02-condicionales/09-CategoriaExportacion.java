import java.util.Scanner;

class CategoriaExportacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad en toneladas: ");
        double toneladas = leer.nextDouble();

        String categoria;

        if (toneladas > 500) {
            categoria = "Exportador Elite";
        } else if (toneladas > 300) {
            categoria = "Exportador Oro";
        } else if (toneladas > 150) {
            categoria = "Exportador Plata";
        } else if (toneladas > 50) {
            categoria = "Exportador Bronce";
        } else {
            categoria = "Productor Local";
        }

        System.out.println("La categoría de exportación es: " + categoria);

        leer.close();
    }
}
