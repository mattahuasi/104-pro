import java.util.Scanner;

class ValorMaxMin {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[10];
        System.out.println("\nIngrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leer.nextInt();
        }

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("\nMáximo: " + max);
        System.out.println("Mínimo: " + min);

        leer.close();
    }
}
