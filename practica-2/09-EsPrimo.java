import java.util.Scanner;

class EsPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        boolean esPrimo = true;

        if (n <= 1) esPrimo = false;

        for (int i = 2; i <= n / 2 && esPrimo; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo) System.out.println("Es primo");
        else System.out.println("No es primo");

        sc.close();
    }
}
