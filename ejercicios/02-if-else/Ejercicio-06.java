import java.util.Scanner;

class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del grupo:");
        String nombre_grupo = leer.nextLine();

        System.out.println("Ingrese el número de alumnos pre-inscritos:");
        int num_alumnos = leer.nextInt();

        System.out.println("Grupo: " + nombre_grupo);
        System.out.println("Inscritos: " + num_alumnos);

        if (num_alumnos >= 30) {
            System.out.println("El grupo será: ABIERTO");
        } else {
            System.out.println("El grupo será: CERRADO");
        }

        leer.close();
    }
}
