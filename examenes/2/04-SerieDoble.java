import java.util.Scanner;

class SerieDoble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        int a = 1;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(b * b + " ");
            } else {
                System.out.print(a + " ");
                b = a;
                a = a + 1;
            }
        }

        sc.close();
    }
}
