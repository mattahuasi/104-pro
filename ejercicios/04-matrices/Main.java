import java.util.Scanner;

public class Main {

    public static int[][] llenarMatriz() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = leer.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = leer.nextInt();
        System.out.println("\nIngrese los elementos de la matriz:");

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        leer.close();

        return matriz;
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int sumarElementos(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static int mayorElemento(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    public static int menorElemento(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static void sumaFilasA(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + suma);
        }
    }

    public static int[] sumaFilasB(int[][] matriz) {
        int[] sumas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            sumas[i] = suma;
        }
        return sumas;
    }

    public static void sumaColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + suma);
        }
    }

    public static void main(String[] args) {
        int[][] matriz = llenarMatriz();

        System.out.println("\nMatriz ingresada:");
        mostrarMatriz(matriz);

        System.out.println(
            "\nSuma de todos los elementos: " + sumarElementos(matriz)
        );

        System.out.println("\nMayor elemento: " + mayorElemento(matriz));
        System.out.println("Menor elemento: " + menorElemento(matriz));

        System.out.println("\nSuma de cada fila:");
        sumaFilasA(matriz);
        System.out.println("\nSuma de cada fila (con arreglo):");
        int[] sumasFilas = sumaFilasB(matriz);
        mostrarArreglo(sumasFilas);
        System.out.println("\nSuma de cada columna:");
        sumaColumnas(matriz);
    }
}
