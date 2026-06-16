import java.util.Scanner;

class Sumatorias {

    public static double factorial(double n) {
        double factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static double sumatoria1(int n) {
        double contador = 3;
        double sumatoria = contador;

        for (int i = 2; i <= n; i++) {
            double frac = 0;
            if (i % 2 == 0) {
                frac = (-1) * (factorial(contador) / factorial(contador + 1));
            } else {
                frac = factorial(contador) / factorial(contador + 1);
            }
            sumatoria += frac;
            contador += 2;
        }

        return sumatoria;
    }

    public static double sumatoria2(int n) {
        double contador = 1;
        double sumatoria = 0;

        for (int i = 1; i <= n; i++) {
            double frac = 0;
            if (i % 2 == 0) {
                frac = (-1) * (factorial(contador) / factorial(contador + 1));
            } else {
                frac = factorial(contador) / factorial(contador + 1);
            }
            sumatoria += frac;
            contador += 2;
        }

        return sumatoria;
    }

    public static double sumatoria3(int n) {
        double sumatoria = 1;

        for (int i = 2; i <= n; i++) {
            double frac = 0;
            if (i % 2 == 0) {
                frac = (-1) * (potencia(i, 2) / factorial(i));
            } else {
                frac = potencia(i, 2) / factorial(i);
            }
            sumatoria += frac;
        }

        return sumatoria;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print(
            "\n[>] Ingrese el número de términos para la sumatoria: "
        );
        int n = leer.nextInt();

        System.out.println("\nResultados:\n");
        System.out.println("[*] Sumatoria 1: 1 a " + n + " = " + sumatoria1(n));
        System.out.println("[*] Sumatoria 2: 1 a " + n + " = " + sumatoria2(n));
        System.out.println("[*] Sumatoria 3: 1 a " + n + " = " + sumatoria3(n));

        leer.close();
    }
}
