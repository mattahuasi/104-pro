import java.util.Scanner;

class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el sueldo del trabajador:");
        double sueldo = leer.nextDouble();
        double nuevo_sueldo;

        if (sueldo < 1000) {
            nuevo_sueldo = sueldo + (sueldo * 0.15);
        } else {
            nuevo_sueldo = sueldo + (sueldo * 0.12);
        }

        System.out.println(
            "El nuevo sueldo del trabajador es: " + nuevo_sueldo
        );

        leer.close();
    }
}
