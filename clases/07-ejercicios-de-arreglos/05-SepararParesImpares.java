import java.util.Scanner;

class SepararParesImpares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leer.nextInt();
        }

        int[] pares = new int[10];
        int[] impares = new int[10];

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        System.out.print("\nArreglo original:\n[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("\nPares:\n[");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i]);
            if (i < contadorPares - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Cantidad = " + contadorPares);

        System.out.print("\nImpares:\n[");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i]);
            if (i < contadorImpares - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Cantidad = " + contadorImpares);

        leer.close();
    }
}
