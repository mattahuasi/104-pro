import java.util.Scanner;

class DesplazamientoCircular {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[7];
        System.out.println("Ingrese 7 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leer.nextInt();
        }

        System.out.print("\nIngrese las posiciones para desplazar: ");
        int k = leer.nextInt();

        k = k % numeros.length;
        for (int i = 0; i < k; i++) {
            int ultimo = numeros[numeros.length - 1];
            for (int j = numeros.length - 1; j > 0; j--) {
                numeros[j] = numeros[j - 1];
            }
            numeros[0] = ultimo;
        }

        System.out.println("\nResultado:\n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        leer.close();
    }
}
