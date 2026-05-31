import java.util.Scanner;

class Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la calificación del alumno:");
        double calificacion = leer.nextDouble();

        if (calificacion >= 8) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }

        leer.close();
    }
}
