package ejercicios.funciones;

import java.util.Scanner;

public class Main {

    public static int calcularCubo(int numero) {
        return numero * numero * numero;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calcularPromedio(int[] numeros) {
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public static int encontrarMenor(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    public static String invertirCadena(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    public static double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static int sumarElementos(int[] arreglo) {
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return suma;
    }

    public static int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int numero : arreglo) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    public static int contarPares(int[] arreglo) {
        int contador = 0;
        for (int numero : arreglo) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = leer.nextInt();

            int numero;
            int[] arregloDinamico;

            switch (opcion) {
                case 1:
                    System.out.print("\n[>] Ingresa un número: ");
                    numero = leer.nextInt();
                    System.out.println(
                        "\n[*] El cubo de " +
                            numero +
                            " es: " +
                            calcularCubo(numero)
                    );
                    break;
                case 2:
                    System.out.print("\n[>] Ingresa un número: ");
                    numero = leer.nextInt();
                    if (esPrimo(numero)) {
                        System.out.println(
                            "\n[*] " + numero + " es un número primo."
                        );
                    } else {
                        System.out.println(
                            "\n[*] " + numero + " no es un número primo."
                        );
                    }
                    break;
                case 3:
                    System.out.println("\n[>] Ingresa 5 números:");
                    int[] numeros = llenarArreglo(leer, 5);
                    System.out.println(
                        "\n[*] El promedio es: " + calcularPromedio(numeros)
                    );
                    break;
                case 4:
                    System.out.print("\n[>] Ingresa el primer número: ");
                    int a = leer.nextInt();
                    System.out.print("[>] Ingresa el segundo número: ");
                    int b = leer.nextInt();
                    System.out.print("[>] Ingresa el tercer número: ");
                    int c = leer.nextInt();
                    System.out.println(
                        "\n[*] El menor de los tres números es: " +
                            encontrarMenor(a, b, c)
                    );
                    break;
                case 5:
                    System.out.print("\n[>] Ingresa un número: ");
                    numero = leer.nextInt();
                    System.out.println(
                        "\n[*] El número " +
                            numero +
                            " tiene " +
                            contarDigitos(numero) +
                            " dígitos."
                    );
                    break;
                case 6:
                    System.out.print("\n[>] Ingresa una cadena de texto: ");
                    leer.nextLine();
                    String texto = leer.nextLine();
                    System.out.println(
                        "\n[*] La cadena invertida es: " + invertirCadena(texto)
                    );
                    break;
                case 7:
                    System.out.print("\n[>] Ingresa la base: ");
                    double base = leer.nextDouble();
                    System.out.print("[>] Ingresa el exponente: ");
                    int exponente = leer.nextInt();
                    System.out.println(
                        "\n[*] " +
                            base +
                            " elevado a " +
                            exponente +
                            " es: " +
                            calcularPotencia(base, exponente)
                    );
                    break;
                case 8:
                    arregloDinamico = pedirYLLenarArreglo(leer);
                    System.out.println(
                        "\n[*] La suma de los elementos del arreglo es: " +
                            sumarElementos(arregloDinamico)
                    );
                    break;
                case 9:
                    arregloDinamico = pedirYLLenarArreglo(leer);
                    System.out.println(
                        "\n[*] El valor máximo del arreglo es: " +
                            encontrarMaximo(arregloDinamico)
                    );
                    break;
                case 10:
                    arregloDinamico = pedirYLLenarArreglo(leer);
                    System.out.println(
                        "\n[*] La cantidad de números pares en el arreglo es: " +
                            contarPares(arregloDinamico)
                    );
                    break;
                case 0:
                    System.out.println("\n[*] Saliendo...");
                    break;
                default:
                    System.out.println(
                        "\n[!] Opción no válida. Intenta de nuevo."
                    );
                    break;
            }
        } while (opcion != 0);

        System.out.println(
            "\n================================================="
        );
        System.out.println("          ¡Gracias por usar el programa!         ");
        System.out.println(
            "=================================================\n"
        );
        leer.close();
    }

    public static void mostrarMenu() {
        System.out.println(
            "\n================================================="
        );
        System.out.println("               MENU DE OPERACIONES               ");
        System.out.println("=================================================");
        System.out.println("  1. Calcular el cubo de un número");
        System.out.println("  2. Determinar si un número es primo");
        System.out.println("  3. Calcular el promedio de 5 números");
        System.out.println("  4. Retornar el menor de tres números");
        System.out.println("  5. Contar cuántos dígitos tiene un número");
        System.out.println("  6. Invertir una cadena de texto");
        System.out.println("  7. Calcular la potencia de un número");
        System.out.println(
            "  8. Retornar la suma de los elementos de un arreglo"
        );
        System.out.println("  9. Encontrar el valor máximo de un arreglo");
        System.out.println(
            " 10. Contar cuántos números pares existen en un arreglo"
        );
        System.out.println("  0. Salir");
        System.out.println("=================================================");
        System.out.print("Elige una opción: ");
    }

    public static int[] llenarArreglo(Scanner leer, int tamano) {
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            System.out.print("    -> Elemento [" + (i + 1) + "]: ");
            arreglo[i] = leer.nextInt();
        }
        return arreglo;
    }

    public static int[] pedirYLLenarArreglo(Scanner leer) {
        System.out.print("\n[>] ¿Cuántos elementos tendrá el arreglo? ");
        int n = leer.nextInt();
        System.out.println("Ingresa los " + n + " elementos:");
        return llenarArreglo(leer, n);
    }
}
