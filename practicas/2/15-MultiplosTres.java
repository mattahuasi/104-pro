import java.util.Scanner;

class MultiplosTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        int cont = 0,
            suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                cont++;
                suma += i;
            }
        }

        System.out.println("\nCuenta: " + cont);
        System.out.println("Suma: " + suma);
        sc.close();
    }
}
