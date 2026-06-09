import java.util.Scanner;

class NumeroReves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        int inv = 0;

        while (n > 0) {
            inv = inv * 10 + (n % 10);
            n /= 10;
        }

        System.out.println("Al revés: " + inv);
        sc.close();
    }
}
