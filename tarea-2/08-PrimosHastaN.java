import java.util.Scanner;

class PrimosHastaN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            int divisor = 2;

            while (divisor < i && esPrimo) {
                if (i % divisor == 0) {
                    esPrimo = false;
                }
                divisor++;
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }
}
