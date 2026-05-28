import java.util.Scanner;

class EvaluarExpresion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, t;

        System.out.println("Evaluar la expresión: 2 + a + b");

        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextInt();

        t = 2 + a + b;

        System.out.println("El resultado de la expresión 2 + a + b es: " + t);

        entrada.close();
    }
}
