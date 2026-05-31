import java.util.Scanner;

class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el largo de la pared en metros: ");
        int largo = leer.nextInt();
        System.out.println("Ingrese el alto de la pared en metros: ");
        int alto = leer.nextInt();

        double area = largo * alto;
        double arena = area * 0.5;

        System.out.println(
            "La cantidad de arena necesaria para revocar la pared es: " +
                arena +
                " metros cúbicos."
        );

        leer.close();
    }
}
