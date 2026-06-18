import java.util.Scanner;

class FuncionesYModularizacion {

    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void ejecutarPotencia(Scanner leer) {
        System.out.print("Base = ");
        int base = leer.nextInt();
        System.out.print("Exponente = ");
        int exponente = leer.nextInt();
        System.out.println(potencia(base, exponente));
    }

    public static int[] registrarEstudiantes(Scanner leer, int n) {
        int[] notas = new int[n];
        System.out.println(
            "\nIngrese las notas de " +
                n +
                " estudiantes separadas por espacio:"
        );
        for (int i = 0; i < n; i++) {
            notas[i] = leer.nextInt();
        }
        return notas;
    }

    public static double calcularPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }

    public static void encontrarMayorYMenor(int[] notas) {
        int mayor = notas[0];
        int menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

    public static void mostrarAprobadosReprobados(int[] notas) {
        int aprobados = 0;
        int reprobados = 0;
        for (int nota : notas) {
            if (nota >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }

    public static void sistemaModularEstudiantes(Scanner leer) {
        int[] notas = registrarEstudiantes(leer, 10);
        System.out.println("\nSalida");
        System.out.println("Promedio: " + calcularPromedio(notas));
        encontrarMayorYMenor(notas);
        mostrarAprobadosReprobados(notas);
    }

    public static int[][] registrarVentas(Scanner leer) {
        int[][] ventas = new int[12][5];
        System.out.println("\nRegistro de ventas (12 meses x 5 sucursales):");
        for (int i = 0; i < 12; i++) {
            System.out.println("Mes " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("  Sucursal " + (j + 1) + ": ");
                ventas[i][j] = leer.nextInt();
            }
        }
        return ventas;
    }

    public static int[] calcularVentasPorSucursal(int[][] ventas) {
        int[] ventasSucursal = new int[5];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                ventasSucursal[j] += ventas[i][j];
            }
        }
        return ventasSucursal;
    }

    public static int[] calcularVentasPorMes(int[][] ventas) {
        int[] ventasMes = new int[12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                ventasMes[i] += ventas[i][j];
            }
        }
        return ventasMes;
    }

    public static int encontrarSucursalMayorVentas(int[] ventasSucursal) {
        int sucursalMayor = 0;
        for (int j = 1; j < ventasSucursal.length; j++) {
            if (ventasSucursal[j] > ventasSucursal[sucursalMayor]) {
                sucursalMayor = j;
            }
        }
        return sucursalMayor;
    }

    public static int encontrarMesMenorVentas(int[] ventasMes) {
        int mesMenor = 0;
        for (int i = 1; i < ventasMes.length; i++) {
            if (ventasMes[i] < ventasMes[mesMenor]) {
                mesMenor = i;
            }
        }
        return mesMenor;
    }

    public static void reporteFinalVentas(Scanner leer) {
        int[][] ventas = registrarVentas(leer);
        int[] ventasSucursal = calcularVentasPorSucursal(ventas);
        int[] ventasMes = calcularVentasPorMes(ventas);
        int sucursalMayor = encontrarSucursalMayorVentas(ventasSucursal);
        int mesMenor = encontrarMesMenorVentas(ventasMes);

        System.out.println("\n--- REPORTE FINAL DE VENTAS ---");
        System.out.println("\nVentas por Sucursal:");
        for (int j = 0; j < ventasSucursal.length; j++) {
            System.out.println(
                "Sucursal " + (j + 1) + ": " + ventasSucursal[j]
            );
        }

        System.out.println("\nVentas por Mes:");
        for (int i = 0; i < ventasMes.length; i++) {
            System.out.println("Mes " + (i + 1) + ": " + ventasMes[i]);
        }

        System.out.println(
            "\nSucursal con mayores ventas: Sucursal " +
                (sucursalMayor + 1) +
                " (" +
                ventasSucursal[sucursalMayor] +
                ")"
        );
        System.out.println(
            "Mes con menores ventas: Mes " +
                (mesMenor + 1) +
                " (" +
                ventasMes[mesMenor] +
                ")"
        );
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===================================");
            System.out.println("1. Función para calcular potencia");
            System.out.println("2. Sistema modular de estudiantes");
            System.out.println("3. Desafío Final (Ventas 12x5)");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarPotencia(leer);
                    break;
                case 2:
                    sistemaModularEstudiantes(leer);
                    break;
                case 3:
                    reporteFinalVentas(leer);
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
