import java.util.Scanner;

class FibonacciN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        int f1 = 0,
            f2 = 1;
        if (n >= 1) System.out.print(f1 + " ");
        if (n >= 2) System.out.print(f2 + " ");

        for (int i = 3; i <= n; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
        System.out.println();
        sc.close();
    }
}
