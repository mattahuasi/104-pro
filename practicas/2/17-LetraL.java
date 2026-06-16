import java.util.Scanner;

class LetraL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la L: ");
        int h = sc.nextInt();

        for (int i = 1; i < h; i++) {
            System.out.println("*");
        }

        int base = (h / 2) + 1;
        for (int i = 1; i <= base; i++) {
            System.out.print("* ");
        }
        System.out.println();
        sc.close();
    }
}
