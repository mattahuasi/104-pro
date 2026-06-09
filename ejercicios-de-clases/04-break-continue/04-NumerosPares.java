import java.util.Scanner;

class NumeroPares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Numeros pares n: ");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(" " + i);
        }

        leer.close();
    }
}
