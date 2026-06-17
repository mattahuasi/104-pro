/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class Matrices {

    public static int[][] llenarMatriz() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero de filas: ");
        int filas = leer.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        int columnas = leer.nextInt();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        leer.close();
        return matriz;
    }

    public static void llenarMatriz2(int[][] matriz, int filas, int columnas) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        leer.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
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

    public static void main(String[] args) {
        int[][] matriz = llenarMatriz();
        System.out.println("\nMatriz ingresada");
        mostrarMatriz(matriz);

        System.out.println("\nMayor elemento: " + mayorElemento(matriz));
        System.out.println("Menor elemento: " + menorElemento(matriz));
    }
}
