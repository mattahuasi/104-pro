import java.util.Scanner;

class PositivosNegativos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0,
            neg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) pos++;
            else if (n < 0) neg++;
        }

        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        sc.close();
    }
}
