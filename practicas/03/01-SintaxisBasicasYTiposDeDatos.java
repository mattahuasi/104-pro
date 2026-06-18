import java.util.Scanner;

class SintaxisBasicasYTiposDeDatos {

    public static void edadFutura(Scanner leer) {
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        int edadFutura = edad + 10;
        System.out.println(
            "\n" + nombre + " tendrá " + edadFutura + " años dentro de 10 años."
        );
    }

    public static void convertirTemperatura(Scanner leer) {
        System.out.print("Temperatura en grados Celsius: ");
        double celsius = leer.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("\n" + fahrenheit + " °F");
    }

    public static void operacionesAritmeticas(Scanner leer) {
        System.out.print("Número 1: ");
        double a = leer.nextDouble();
        System.out.print("Número 2: ");
        double b = leer.nextDouble();
        System.out.println("\nSuma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b == 0) {
            System.out.println("No existe división entre cero.");
        } else {
            System.out.println("División: " + (a / b));
        }
    }

    public static void puedeVotar(Scanner leer) {
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        if (edad >= 18) {
            System.out.println("\nPuede votar.");
        } else {
            System.out.println("\nNo puede votar.");
        }
    }

    public static void intercambiarValores(Scanner leer) {
        System.out.print("Valor A: ");
        int a = leer.nextInt();
        System.out.print("Valor B: ");
        int b = leer.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nA=" + a);
        System.out.println("B=" + b);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Cálculo de edad futura");
            System.out.println("2. Conversión de temperatura");
            System.out.println("3. Operaciones aritméticas");
            System.out.println("4. Evaluación lógica");
            System.out.println("5. Intercambio de variables");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            System.out.println();
            switch (opcion) {
                case 1:
                    edadFutura(leer);
                    break;
                case 2:
                    convertirTemperatura(leer);
                    break;
                case 3:
                    operacionesAritmeticas(leer);
                    break;
                case 4:
                    puedeVotar(leer);
                    break;
                case 5:
                    intercambiarValores(leer);
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
