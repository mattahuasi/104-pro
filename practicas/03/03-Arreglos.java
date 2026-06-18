import java.util.Scanner;

class Arreglos {

    public static int[] leerArreglo(Scanner leer, int n) {
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = leer.nextInt();
        }
        return arreglo;
    }

    public static int[] leerArregloHastaN(Scanner leer) {
        System.out.print("\nCantidad de elementos: ");
        int n = leer.nextInt();
        return leerArreglo(leer, n);
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void promedio(Scanner leer) {
        System.out.println("\nIngrese 10 números:");
        int[] arreglo = leerArreglo(leer, 10);
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double promedio = (double) suma / arreglo.length;
        System.out.println("Promedio = " + promedio);
    }

    public static void mayor(Scanner leer) {
        System.out.println("\nIngrese 15 números:");
        int[] arreglo = leerArreglo(leer, 15);
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println("Mayor = " + mayor);
    }

    public static void menor(Scanner leer) {
        int[] arreglo = leerArregloHastaN(leer);
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        System.out.println("Menor = " + menor);
    }

    public static void busquedaSecuencial(Scanner leer) {
        int[] arreglo = leerArregloHastaN(leer);
        System.out.print("Buscar: ");
        int numero = leer.nextInt();
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Encontrado en posición " + (posicion + 1));
        } else {
            System.out.println("No encontrado");
        }
    }

    public static void contarParesImpares(Scanner leer) {
        int[] arreglo = leerArregloHastaN(leer);
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    public static void burbuja(Scanner leer) {
        int[] arreglo = leerArregloHastaN(leer);
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        mostrarArreglo(arreglo);
    }

    public static void invertir(Scanner leer) {
        int[] arreglo = leerArregloHastaN(leer);
        for (int i = 0; i < arreglo.length / 2; i++) {
            int aux = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = aux;
        }
        mostrarArreglo(arreglo);
    }

    public static void unir(Scanner leer) {
        int[] arreglo1 = leerArreglo(leer, 5);
        int[] arreglo2 = leerArreglo(leer, 5);
        int[] arreglo3 = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i] = arreglo1[i];
        }
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo3[arreglo1.length + i] = arreglo2[i];
        }

        mostrarArreglo(arreglo3);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n1. Promedio de un vector");
            System.out.println("2. Mayor elemento");
            System.out.println("3. Menor elemento");
            System.out.println("4. Búsqueda secuencial");
            System.out.println("5. Conteo de pares e impares");
            System.out.println("6. Ordenamiento burbuja");
            System.out.println("7. Invertir arreglo");
            System.out.println("8. Unión de vectores");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    promedio(leer);
                    break;
                case 2:
                    mayor(leer);
                    break;
                case 3:
                    menor(leer);
                    break;
                case 4:
                    busquedaSecuencial(leer);
                    break;
                case 5:
                    contarParesImpares(leer);
                    break;
                case 6:
                    burbuja(leer);
                    break;
                case 7:
                    invertir(leer);
                    break;
                case 8:
                    unir(leer);
                    break;
                case 0:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida.");
            }
        } while (opcion != 0);

        stopScanner(leer);
    }

    private static void stopScanner(Scanner leer) {
        leer.close();
    }
}
