import java.util.Scanner;

class MetodoBurbuja {

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

        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - 1) - i; j++) {
                if (A[j] > A[j + 1]) {
                    int aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}
