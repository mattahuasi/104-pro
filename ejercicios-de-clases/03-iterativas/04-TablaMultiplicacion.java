import java.util.Scanner;

class TablaMultiplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el numero de tablas para generar: ");
        int n = leer.nextInt();

        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tabla de multiplicar del: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }

        leer.close();
    }
}
