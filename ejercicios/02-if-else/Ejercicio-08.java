import java.util.Scanner;

class Ejercicio08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo A:");
        String equipoA = leer.nextLine();
        System.out.println("Ingrese los goles anotados por el equipo A:");
        int gA = leer.nextInt();
        System.out.println(
            "Ingrese los goles de penal anotados por el equipo A:"
        );
        int pA = leer.nextInt();

        leer.nextLine();

        System.out.println("Ingrese el nombre del equipo B:");
        String equipoB = leer.nextLine();
        System.out.println("Ingrese los goles anotados por el equipo B:");
        int gB = leer.nextInt();
        System.out.println(
            "Ingrese los goles de penal anotados por el equipo B:"
        );
        int pB = leer.nextInt();

        int totalA = gA + pA;
        int totalB = gB + pB;

        if (totalA > totalB) {
            System.out.println(
                "Ganador: " +
                    equipoA +
                    " con marcador " +
                    totalA +
                    " a " +
                    totalB
            );
        } else {
            if (totalB > totalA) {
                System.out.println(
                    "Ganador: " +
                        equipoB +
                        " con marcador " +
                        totalB +
                        " a " +
                        totalA
                );
            } else {
                System.out.println("Empate entre " + equipoA + " y " + equipoB);
            }
        }

        leer.close();
    }
}
