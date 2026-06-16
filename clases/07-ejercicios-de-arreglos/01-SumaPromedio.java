import java.util.Scanner;

class SumaPromedio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de números: ");
        int n = leer.nextInt();

        int[] numeros = new int[n];
        int suma = 0;
        System.out.println("\nIngrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = leer.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / n;

        System.out.println("\nSuma: " + suma);
        System.out.println("Promedio: " + promedio);

        leer.close();
    }
}
