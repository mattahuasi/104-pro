import java.util.Scanner;

class MultiplosKPosiciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Ingrese el valor de k: ");
        int k = sc.nextInt();

        System.out.println();
        System.out.println("Los múltiplos de " + k + " y sus posiciones son:");
        for (int i = 0; i < n; i++) {
            if (A[i] % k == 0) {
                System.out.println(
                    "Elemento: " + A[i] + " en la posición: " + i
                );
            }
        }

        sc.close();
    }
}
