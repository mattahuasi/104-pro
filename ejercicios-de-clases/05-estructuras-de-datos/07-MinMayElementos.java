import java.util.Scanner;

class MinMayElementos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nuevo elemento: ");
            A[i] = sc.nextInt();
        }
        int min = A[0];
        int posMin = 0;
        int max = A[0];
        int posMax = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] >= max) {
                max = A[i];
                posMax = i;
            }
        }
        for (int i = 1; i < n; i++) {
            if (A[i] <= min) {
                min = A[i];
                posMin = i;
            }
        }
        System.out.println();
        System.out.println(
            "El elemento mayor es: " + max + " en la posición: " + posMax
        );
        System.out.println(
            "El elemento menor es: " + min + " en la posición: " + posMin
        );
        sc.close();
    }
}
