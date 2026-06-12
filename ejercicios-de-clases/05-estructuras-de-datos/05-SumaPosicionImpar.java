import java.util.Scanner;

class SumaPosicionImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int suma = 0;

        int[] A = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = sc.nextInt();
            if (i % 2 != 0) {
                suma += A[i];
            }
        }

        System.out.println(
            "La suma de los elementos en posiciones impares es: " + suma
        );
        sc.close();
    }
}
