import java.util.Scanner;

class EvaluacionSucesiva {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextInt();

        b = a + 10;
        c = 2 * b + a;
        d = a + b + c + 5;

        System.out.println(
            "Los resultados de las variables son: " +
                "a: " +
                a +
                ", b: " +
                b +
                ", c: " +
                c +
                ", d: " +
                d
        );

        entrada.close();
    }
}
