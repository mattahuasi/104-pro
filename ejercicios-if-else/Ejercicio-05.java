import java.util.Scanner;

class Ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la matrícula del alumno:");
        String matricula = leer.nextLine();

        System.out.println("Ingrese las 5 calificaciones del alumno:");
        double c1 = leer.nextDouble();
        double c2 = leer.nextDouble();
        double c3 = leer.nextDouble();
        double c4 = leer.nextDouble();
        double c5 = leer.nextDouble();

        double promedio = (c1 + c2 + c3 + c4 + c5) / 5;

        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("No aprobado");
        }

        leer.close();
    }
}
