import java.util.Scanner;

class OperacionMatematica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print(
            "Seleccione una operación (1: Suma, 2: Resta, 3: Multiplicación, 4: División): "
        );
        int operacion = entrada.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println(
                        "Error: División por cero no permitida."
                    );
                    break;
                }
                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        entrada.close();
    }
}
