import java.util.Scanner;

class Matrices {

    public static int[][] leerMatriz(Scanner leer, int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
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

    public static void sumaElementos(Scanner leer) {
        System.out.println("\nEntrada (Matriz 3x3):");
        int[][] matriz = leerMatriz(leer, 3, 3);
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("Suma = " + suma);
    }

    public static void mayorElemento(Scanner leer) {
        System.out.println("\nEntrada (Matriz 4x4):");
        int[][] matriz = leerMatriz(leer, 4, 4);
        int mayor = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("Mayor = " + mayor);
    }

    public static void sumaMatrices(Scanner leer) {
        System.out.println("\nEntrada (Matriz A 2x2):");
        int[][] matrizA = leerMatriz(leer, 2, 2);
        System.out.println("Entrada (Matriz B 2x2):");
        int[][] matrizB = leerMatriz(leer, 2, 2);

        int[][] suma = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        mostrarMatriz(suma);
    }

    public static void diagonalPrincipal(Scanner leer) {
        System.out.println("\nEntrada (Matriz 3x3):");
        int[][] matriz = leerMatriz(leer, 3, 3);
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][i];
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n1. Suma de elementos de una matriz");
            System.out.println("2. Mayor elemento de una matriz");
            System.out.println("3. Suma de matrices");
            System.out.println("4. Diagonal principal");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sumaElementos(leer);
                    break;
                case 2:
                    mayorElemento(leer);
                    break;
                case 3:
                    sumaMatrices(leer);
                    break;
                case 4:
                    diagonalPrincipal(leer);
                    break;
                case 0:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida.");
            }
        } while (opcion != 0);

        leer.close();
    }
}
