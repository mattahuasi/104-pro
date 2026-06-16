import java.util.Scanner;

class Fibonacci {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = leer.nextInt();

        int a = -1;
        int b = 1;
        int f = 0;

        for (int i = 1; i <= n; i++) {
            f = a + b;
            a = b;
            b = f;
            System.out.print(f + " ");
        }

        leer.close();
    }
}
