import java.util.Scanner;

class PiramideCar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura: ");
        int h = sc.nextInt();
        System.out.print("Carácter: ");
        char c = sc.next().charAt(0);

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print(c);
            System.out.println();
        }
        sc.close();
    }
}
