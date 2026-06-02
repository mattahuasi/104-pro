import java.util.Scanner;

class CalculoNuevoSueldo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la categoría del trabajador (1-4): ");
        int categoria = teclado.nextInt();

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = teclado.nextDouble();

        double nuevoSueldo = 0.0;

        switch (categoria) {
            case 1:
                nuevoSueldo = sueldo * (1.15);
                break;
            case 2:
                nuevoSueldo = sueldo * (1.10);
                break;
            case 3:
                nuevoSueldo = sueldo * (1.08);
                break;
            case 4:
                nuevoSueldo = sueldo * (1.07);
                break;
            default:
                nuevoSueldo = sueldo;
                break;
        }

        System.out.println("--- RESULTADOS ---");
        System.out.println("Categoría del trabajador: " + categoria);
        System.out.println("Su nuevo sueldo es: " + nuevoSueldo);

        teclado.close();
    }
}
