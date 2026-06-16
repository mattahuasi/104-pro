import java.util.Scanner;

class SerieBinario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }

        leer.close();
    }
}
