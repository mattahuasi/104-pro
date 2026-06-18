package competencia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Forzar uso de punto para decimales (evita problemas con nextDouble en entornos en español)
        Scanner leer = new Scanner(System.in).useLocale(Locale.US);
        int opcion;

        do {
            System.out.println(
                "\n======================================================="
            );
            System.out.println("   CAMPEONATO - PROGRAMACIÓN I - TURNO NOCHE");
            System.out.println(
                "======================================================="
            );
            System.out.println("1. Mayor de tres números (anidado)");
            System.out.println("2. Contar dígitos");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Suma hasta ingresar 0");
            System.out.println("5. Promedio de notas");
            System.out.println("6. Serie Fibonacci");
            System.out.println("7. Serie de cuadrados");
            System.out.println("8. Arreglos: Suma de elementos");
            System.out.println("9. Arreglos: Mayor elemento");
            System.out.println("10. Arreglos: Promedio");
            System.out.println("11. Matrices: Suma de elementos pares");
            System.out.println("12. Matrices: Encontrar el mayor elemento");
            System.out.println("0. Salir");
            System.out.print("Seleccione un ejercicio (0-12): ");

            opcion = leer.nextInt();
            System.out.println(
                "-------------------------------------------------------"
            );

            switch (opcion) {
                case 1:
                    ejercicio1(leer);
                    break;
                case 2:
                    ejercicio2(leer);
                    break;
                case 3:
                    ejercicio3(leer);
                    break;
                case 4:
                    ejercicio4(leer);
                    break;
                case 5:
                    ejercicio5(leer);
                    break;
                case 6:
                    ejercicio6(leer);
                    break;
                case 7:
                    ejercicio7(leer);
                    break;
                case 8:
                    ejercicio8(leer);
                    break;
                case 9:
                    ejercicio9(leer);
                    break;
                case 10:
                    ejercicio10(leer);
                    break;
                case 11:
                    ejercicio11(leer);
                    break;
                case 12:
                    ejercicio12(leer);
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        leer.close();
    }

    // =========================================================================
    // FUNCIONES AUXILIARES DE REUTILIZACIÓN (ARREGLOS Y MATRICES)
    // =========================================================================

    public static int[] leerArreglo(int n, Scanner leer) {
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = leer.nextInt();
        }
        return arreglo;
    }

    public static double[] leerArregloReales(int n, Scanner leer) {
        double[] arreglo = new double[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = leer.nextDouble();
        }
        return arreglo;
    }

    public static int[][] leerMatriz(int n, int m, Scanner leer) {
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        return matriz;
    }

    // =========================================================================
    // EJERCICIOS DEL CAMPEONATO
    // =========================================================================

    /**
     * Ejercicio 1: Mayor de tres números (anidado)
     * Leer tres números enteros y mostrar el mayor.
     */
    public static void ejercicio1(Scanner leer) {
        System.out.println(
            "Ejercicio 1: Ingrese tres números enteros (a b c):"
        );
        int a = leer.nextInt();
        int b = leer.nextInt();
        int c = leer.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }

    /**
     * Ejercicio 2: Contar dígitos
     * Leer un número entero positivo y contar cuántos dígitos tiene usando while.
     */
    public static void ejercicio2(Scanner leer) {
        System.out.println("Ejercicio 2: Ingrese un entero positivo:");
        int numero = leer.nextInt();

        if (numero <= 0) {
            System.out.println("Debe ser un entero positivo.");
            return;
        }

        int contador = 0;
        int temp = numero;
        while (temp > 0) {
            temp /= 10;
            contador++;
        }
        System.out.println(contador);
    }

    /**
     * Ejercicio 3: Tabla de multiplicar
     * Leer un número N y mostrar su tabla de multiplicar del 1 al 10.
     */
    public static void ejercicio3(Scanner leer) {
        System.out.println("Ejercicio 3: Ingrese un entero N:");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            if (i < n) {
                System.out.println("==");
                System.out.println("======");
            }
        }
    }

    /**
     * Ejercicio 4: Suma hasta ingresar 0
     * Leer números y sumarlos hasta que el usuario ingrese 0.
     */
    public static void ejercicio4(Scanner leer) {
        System.out.println(
            "Ejercicio 4: Ingrese una secuencia de números (termine con 0):"
        );
        int suma = 0;
        int num;

        do {
            num = leer.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println(suma);
    }

    /**
     * Ejercicio 5: Promedio de notas
     * Leer notas positivas hasta ingresar -1. Calcular el promedio.
     */
    public static void ejercicio5(Scanner leer) {
        System.out.println(
            "Ejercicio 5: Ingrese notas positivas (termine con -1):"
        );
        double suma = 0;
        int contador = 0;
        double nota;

        while (true) {
            nota = leer.nextDouble();
            if (nota == -1) {
                break;
            }
            if (nota >= 0) {
                suma += nota;
                contador++;
            }
        }

        if (contador > 0) {
            System.out.printf(Locale.US, "%.2f\n", (suma / contador));
        } else {
            System.out.println("0.00");
        }
    }

    /**
     * Ejercicio 6: Serie Fibonacci
     * Mostrar los primeros N términos de la serie Fibonacci.
     */
    public static void ejercicio6(Scanner leer) {
        System.out.println("Ejercicio 6: Ingrese un entero N:");
        int n = leer.nextInt();

        if (n <= 0) return;

        int t1 = 0,
            t2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(t1);
            if (i < n) {
                System.out.print("-"); // Formato según salida esperada: 0-1-1-2...
            }
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }

    /**
     * Ejercicio 7: Serie de cuadrados
     * Mostrar los cuadrados perfectos desde 1^2 hasta N^2.
     */
    public static void ejercicio7(Scanner leer) {
        System.out.println("Ejercicio 7: Ingrese un entero N:");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i * i));
            if (i < n) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /**
     * Ejercicio 8: Suma de elementos (Arreglos)
     * Leer N números en un arreglo y calcular su suma.
     */
    public static void ejercicio8(Scanner leer) {
        System.out.println(
            "Ejercicio 8: Ingrese la cantidad N y luego los elementos del arreglo:"
        );
        int n = leer.nextInt();
        int[] arreglo = leerArreglo(n, leer);

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }
        System.out.println(suma);
    }

    /**
     * Ejercicio 9: Mayor elemento del arreglo
     * Leer N números y encontrar el mayor.
     */
    public static void ejercicio9(Scanner leer) {
        System.out.println(
            "Ejercicio 9: Ingrese la cantidad N y luego los elementos del arreglo:"
        );
        int n = leer.nextInt();
        int[] arreglo = leerArreglo(n, leer);

        if (n <= 0) return;

        int max = arreglo[0];
        for (int i = 1; i < n; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        System.out.println(max);
    }

    /**
     * Ejercicio 10: Promedio de un arreglo
     * Leer N números reales y calcular su promedio.
     */
    public static void ejercicio10(Scanner leer) {
        System.out.println(
            "Ejercicio 10: Ingrese la cantidad N y luego los elementos reales:"
        );
        int n = leer.nextInt();
        double[] arreglo = leerArregloReales(n, leer);

        if (n <= 0) return;

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }
        System.out.printf(Locale.US, "%.2f\n", (suma / n));
    }

    /**
     * Ejercicio 11: Suma los elementos pares de una matriz
     * Leer una matriz de N x M y sumar los pares.
     */
    public static void ejercicio11(Scanner leer) {
        System.out.println(
            "Ejercicio 11: Ingrese filas N, columnas M y los elementos:"
        );
        int n = leer.nextInt();
        int m = leer.nextInt();
        int[][] matriz = leerMatriz(n, m, leer);

        int sumaPares = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                }
            }
        }
        System.out.println(sumaPares);
    }

    /**
     * Ejercicio 12: Encontrar el mayor elemento de una matriz
     * Leer una matriz N x M y mostrar el elemento mayor.
     */
    public static void ejercicio12(Scanner leer) {
        System.out.println(
            "Ejercicio 12: Ingrese filas N, columnas M y los elementos:"
        );
        int n = leer.nextInt();
        int m = leer.nextInt();
        int[][] matriz = leerMatriz(n, m, leer);

        if (n <= 0 || m <= 0) return;

        int max = matriz[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
