import java.util.Scanner;

public class Main {

    public static int[][] llenarMatriz(int fila, int columna) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        leer.close();
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\nIngrese los elementos de la matriz (3x3):");
        int[][] matriz = llenarMatriz(3, 3);
        System.out.println("\nMatriz ingresada:");
        mostrarMatriz(matriz);
    }
}
