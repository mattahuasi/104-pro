import java.util.Scanner;

class MenuCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(
                "\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir"
            );
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double a = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double b = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) System.out.println("Resultado: " + (a / b));
                        else System.out.println("Error: División por cero.");
                        break;
                }
            }
        } while (opcion != 5);

        scanner.close();
    }
}
