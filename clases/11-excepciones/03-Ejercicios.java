import java.util.Scanner;

class Ejercicios {

    public static void leerDouble(Scanner escaner) {
        String entrada;
        double n;

        do {
            try {
                System.out.print("Ingrese un numero: ");
                entrada = escaner.nextLine();

                if (entrada.contains(".") || entrada.contains(",")) {
                    n = Double.parseDouble(entrada.replace(",", "."));
                    System.out.println("Numero ingresado: " + n);
                    break;
                } else {
                    System.out.println(
                        "El numero debe contener un punto o una coma para ser considerado un numero decimal"
                    );
                }
            } catch (Exception e) {
                System.out.println("Dato incorrecto");
                System.out.println("Mensaje: " + e.getClass().getSimpleName());
                escaner.nextLine(); // Limpiar buffer
            }
        } while (true);
    }

    public static void leerBoolean(Scanner escaner) {
        String entrada;
        boolean valor;

        do {
            try {
                System.out.print("Ingrese un valor booleano (true/false): ");
                entrada = escaner.nextLine();

                if (
                    entrada.equalsIgnoreCase("true") ||
                    entrada.equalsIgnoreCase("false")
                ) {
                    valor = Boolean.parseBoolean(entrada);
                    System.out.println("Valor ingresado: " + valor);
                    break;
                } else {
                    System.out.println(
                        "El valor debe ser 'true' o 'false' para ser considerado un valor booleano"
                    );
                }
            } catch (Exception e) {
                System.out.println("Dato incorrecto");
                System.out.println("Mensaje: " + e.getClass().getSimpleName());
                escaner.nextLine(); // Limpiar buffer
            }
        } while (true);
    }

    public static void leerString(Scanner escaner) {
        String entrada;

        do {
            try {
                System.out.print("Ingrese una cadena de texto: ");
                entrada = escaner.nextLine();

                if (!entrada.trim().isEmpty()) {
                    System.out.println("Cadena ingresada: " + entrada);
                    break;
                } else {
                    System.out.println(
                        "La cadena no puede estar vacía para ser considerada un valor String"
                    );
                }
            } catch (Exception e) {
                System.out.println("Dato incorrecto");
                System.out.println("Mensaje: " + e.getClass().getSimpleName());
                escaner.nextLine(); // Limpiar buffer
            }
        } while (true);
    }

    public static void leerChar(Scanner escaner) {
        String entrada;
        char caracter;

        do {
            try {
                System.out.print("Ingrese un caracter: ");
                entrada = escaner.nextLine();

                if (entrada.length() == 1) {
                    caracter = entrada.charAt(0);
                    System.out.println("Caracter ingresado: " + caracter);
                    break;
                } else {
                    System.out.println(
                        "Debe ingresar un solo caracter para ser considerado un valor char"
                    );
                }
            } catch (Exception e) {
                System.out.println("Dato incorrecto");
                System.out.println("Mensaje: " + e.getClass().getSimpleName());
                escaner.nextLine(); // Limpiar buffer
            }
        } while (true);
    }

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Leer Double");
            System.out.println("2. Leer Boolean");
            System.out.println("3. Leer String");
            System.out.println("4. Leer Char");
            System.out.println("0. Salir");

            System.out.print("Opción: ");
            opcion = escaner.nextInt();
            escaner.nextLine();

            switch (opcion) {
                case 1:
                    leerDouble(escaner);
                    break;
                case 2:
                    leerBoolean(escaner);
                    break;
                case 3:
                    leerString(escaner);
                    break;
                case 4:
                    leerChar(escaner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 0);

        escaner.close();
    }
}
