import java.util.Scanner;

class Estadisticas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0,
            negativos = 0,
            suma = 0;

        System.out.println("Ingrese números (0 para salir):");
        int n = scanner.nextInt();

        while (n != 0) {
            suma += n;
            if (n > 0) positivos++;
            else if (n < 0) negativos++;

            n = scanner.nextInt();
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Suma: " + suma);
        scanner.close();
    }
}
