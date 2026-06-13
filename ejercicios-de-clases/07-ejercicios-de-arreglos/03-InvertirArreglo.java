import java.util.Scanner;

class InvertirArreglo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("\nIngrese 8 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leer.nextInt();
        }

        System.out.print("\nAntes:\n[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int n = numeros.length;
        for (int i = 0; i < n / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[n - i - 1];
            numeros[n - i - 1] = aux;
        }

        System.out.print("\nDespués:\n[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        leer.close();
    }
}
