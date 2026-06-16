import java.util.Scanner;

class RangoSiete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a y b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int menor = Math.min(a, b);
        int mayor = Math.max(a, b);

        for (int i = menor; i <= mayor; i += 7) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
