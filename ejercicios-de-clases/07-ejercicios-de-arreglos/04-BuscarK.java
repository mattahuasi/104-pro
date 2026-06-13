import java.util.Scanner;

class BuscarK {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[12];
        System.out.println("\nIngrese 12 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leer.nextInt();
        }

        System.out.print("\nIngrese el número a buscar: ");
        int k = leer.nextInt();
        int contador = 0;
        int[] posiciones = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == k) {
                posiciones[contador] = i;
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("\nCantidad de apariciones = " + contador);
            System.out.println("\nPosiciones:");
            for (int i = 0; i < contador; i++) {
                System.out.println(posiciones[i]);
            }
        } else {
            System.out.println("\nNo se encontró el número: " + k);
        }

        leer.close();
    }
}
