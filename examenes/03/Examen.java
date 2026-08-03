/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author COMROES
 */
public class Examen {

    public static int leerEntero(Scanner leer) {
        int n;
        do {
            try {
                n = leer.nextInt();
                return n;
            } catch (Exception e) {
                System.out.println("El dato debe ser un numero entero");
            }
        } while (true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        // ejercicio1(leer);
        //  ejercicio2(leer);
        // ejercicio3(leer);
        // ejercicio4(leer);
        // ejercicio5(leer);
        //  ejercicio6(leer);
        // opcional(leer);

        leer.close();
    }

    public static void ejercicio1(Scanner leer) {
        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();
        if (n == 0) {
            System.out.println("CERO");
        } else if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("POSITIVO PAR");
            } else {
                System.out.println("POSITIVO IMPAR");
            }
        } else {
            if (Math.abs(n) > 100) {
                System.out.println("NEGATIVO MAYOR QUE 100");
            } else {
                System.out.println("NEGATIVO MENOR O IGUAL QUE 100");
            }
        }
    }

    public static void ejercicio2(Scanner leer) {
        int nota;

        do {
            System.out.print("Ingrese la nota: ");
            nota = leer.nextInt();
        } while (nota < 0 || nota > 100);

        if (nota > 85) {
            System.out.println("EXCELENTE");
        } else if (nota > 70) {
            System.out.println("BUENO");
        } else if (nota > 50) {
            System.out.println("REGULAR");
        } else {
            System.out.println("REPROBADO");
        }
    }

    public static void ejercicio3(Scanner leer) {
        int sp = 0;
        int cp = 0;
        int sn = 0;
        int cn = 0;
        int n;

        do {
            System.out.print("Ingrese un numero: ");
            n = leer.nextInt();
            leer.nextLine();
            if (n > 0) {
                sp += n;
                cp++;
            } else if (n < 0) {
                sn += n;
                cn++;
            }
        } while (n != 0);

        System.out.println("POSITIVOS: " + cp);
        System.out.println("NEGATIVOS: " + cn);
        System.out.println("SUMA POSITIVOS: " + sp);
        System.out.println("SUMA NEGATIVOS: " + sn);
    }

    public static void ejercicio4(Scanner leer) {
        int op;
        do {
            System.out.println(
                "1. Mostrar la tabla de multiplicar de un número"
            );
            System.out.println("2. Calcular el factorial de un número");
            System.out.println("3. Mostrar si un número es primo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            op = leer.nextInt();
            leer.nextLine();

            switch (op) {
                case 1:
                    tabla(leer);
                    break;
                case 2:
                    factorial(leer);
                    break;
                case 3:
                    esPrimo(leer);
                    break;
                case 0:
                    System.out.println("Finalizando");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (op != 0);
    }

    public static void ejercicio5(Scanner leer) {
        System.out.print("Ingrese la cantidad de notas: ");
        int n = leer.nextInt();
        int[] notas = new int[n];
        int suma = 0;
        System.out.println("Ingrese " + n + " notas");
        for (int i = 0; i < n; i++) {
            do {
                notas[i] = leer.nextInt();
            } while (notas[i] < 0 || notas[i] > 100);
            suma += notas[i];
        }

        double promedio = 0;
        if (suma > 0) {
            promedio = suma / n;
        }

        int mayor = notas[0];
        int menor = notas[0];
        int encima = 0;
        int debajo = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] > promedio) {
                encima++;
            } else if (notas[i] < promedio) {
                debajo++;
            }
        }

        System.out.println("PROMEDIO: " + promedio);
        System.out.println("MAYOR: " + mayor);
        System.out.println("MENOR: " + menor);
        System.out.println("ENCIMA_DEL_PROMEDIO: " + encima);
        System.out.println("EBAJO_DEL_PROMEDIO: " + debajo);
    }

    public static void ejercicio6(Scanner leer) {
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = leer.nextInt();
        int[] arreglo = new int[n];
        System.out.println("Ingrese " + n + " elementos");
        for (int i = 0; i < n; i++) {
            arreglo[i] = leer.nextInt();
        }

        System.out.print("Ingrese un numero para buscar: ");
        int x = leer.nextInt();
        int[] posiciones = new int[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (arreglo[i] == x) {
                posiciones[contador] = i + 1;
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("EXISTE");
            System.out.print("POSICIONES: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(posiciones[i] + " ");
            }
            System.out.println("\nAPARICIONES: " + contador);
        } else {
            System.out.println("NO EXISTE");
        }
    }

    public static void tabla(Scanner leer) {
        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void factorial(Scanner leer) {
        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }

    public static void esPrimo(Scanner leer) {
        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println(n + " ES PRIMO");
        } else {
            System.out.println(n + " NO ES PRIMO");
        }
    }

    public static void opcional(Scanner leer) {
        System.out.print("Filas: ");
        int filas = leer.nextInt();
        System.out.print("Columnas: ");
        int columnas = leer.nextInt();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        double[] promedioFilas = new double[filas];
        double[] promedioColumnas = new double[columnas];

        for (int i = 0; i < filas; i++) {
            double suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
            if (suma > 0) {
                promedioFilas[i] = suma / filas;
            }
        }

        for (int j = 0; j < columnas; j++) {
            double suma = 0;
            for (int i = 0; i < filas; i++) {
                suma += matriz[i][j];
            }
            if (suma > 0) {
                promedioColumnas[j] = suma / columnas;
            }
        }

        for (int i = 0; i < filas; i++) {
            System.out.println("FILA " + (i + 1) + " " + promedioFilas[i]);
        }

        for (int i = 0; i < columnas; i++) {
            System.out.println(
                "COLUMNA " + (i + 1) + " " + promedioColumnas[i]
            );
        }

        int filaMayorPromedio = 0;
        double mayorPromedio = promedioFilas[0];
        for (int i = 0; i < filas; i++) {
            if (promedioFilas[i] > mayorPromedio) {
                filaMayorPromedio = i + 1;
            }
        }

        System.out.println("FILA MAYOR PROMEDIO: " + filaMayorPromedio);
    }
}
