import java.util.Scanner;

class EstructurasDeControl {

    public static void positivoNegativo(Scanner leer) {
        System.out.print("\nNúmero: ");
        int numero = leer.nextInt();
        if (numero > 0) {
            System.out.println("\nNúmero positivo");
        } else if (numero < 0) {
            System.out.println("\nNúmero negativo");
        } else {
            System.out.println("\nEl número es cero");
        }
    }

    public static void parImpar(Scanner leer) {
        System.out.print("\nNúmero: ");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("\nPar");
        } else {
            System.out.println("\nImpar");
        }
    }

    public static void mayorDeTres(Scanner leer) {
        System.out.print("\nNúmero 1: ");
        int a = leer.nextInt();
        System.out.print("Número 2: ");
        int b = leer.nextInt();
        System.out.print("Número 3: ");
        int c = leer.nextInt();
        if (a == b && b == c) {
            System.out.println("\nLos tres números son iguales.");
            return;
        }
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        System.out.println("\nEl mayor es: " + mayor);
    }

    public static void clasificacionNotas(Scanner leer) {
        System.out.print("\nNota: ");
        int nota = leer.nextInt();
        if (nota < 0 || nota > 100) {
            System.out.println("\nLa nota debe estar entre 0 y 100.");
        } else if (nota >= 90) {
            System.out.println("\nExcelente");
        } else if (nota >= 80) {
            System.out.println("\nBueno");
        } else if (nota >= 70) {
            System.out.println("\nRegular");
        } else {
            System.out.println("\nReprobado");
        }
    }

    public static void tablaMultiplicar(Scanner leer) {
        System.out.print("\nNúmero: ");
        int numero = leer.nextInt();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void sumaNumeros(Scanner leer) {
        System.out.print("\nNúmero: ");
        int numero = leer.nextInt();
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("\n" + suma);
    }

    public static void factorial(Scanner leer) {
        System.out.print("\nNúmero: ");
        int numero = leer.nextInt();
        if (numero < 0) {
            System.out.println("\nNo existe factorial de números negativos.");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("\n" + factorial);
    }

    public static void contarPares(Scanner leer, int n) {
        int contador = 0;
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            int numero = leer.nextInt();
            if (numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println("\nCantidad de pares: " + contador);
    }

    public static void sumaHastaNegativo(Scanner leer) {
        int suma = 0;
        System.out.println();
        while (true) {
            System.out.print("Número: ");
            int numero = leer.nextInt();
            if (numero < 0) {
                break;
            }
            suma += numero;
        }
        System.out.println("\nSuma = " + suma);
    }

    public static void usoContinuar() {
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void usoRomper(Scanner leer) {
        System.out.println();
        while (true) {
            System.out.print("Número: ");
            int numero = leer.nextInt();
            if (numero == 0) {
                break;
            }
        }
        System.out.println("\nPrograma finalizado");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n1. Número positivo o negativo");
            System.out.println("2. Número par o impar");
            System.out.println("3. Mayor de tres números");
            System.out.println("4. Clasificación de notas");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Suma de N números");
            System.out.println("7. Factorial");
            System.out.println("8. Contador de pares");
            System.out.println("9. Suma hasta negativo");
            System.out.println("10. Uso de Continuar");
            System.out.println("11. Uso de Romper");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    positivoNegativo(leer);
                    break;
                case 2:
                    parImpar(leer);
                    break;
                case 3:
                    mayorDeTres(leer);
                    break;
                case 4:
                    clasificacionNotas(leer);
                    break;
                case 5:
                    tablaMultiplicar(leer);
                    break;
                case 6:
                    sumaNumeros(leer);
                    break;
                case 7:
                    factorial(leer);
                    break;
                case 8:
                    contarPares(leer, 10);
                    break;
                case 9:
                    sumaHastaNegativo(leer);
                    break;
                case 10:
                    usoContinuar();
                    break;
                case 11:
                    usoRomper(leer);
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
