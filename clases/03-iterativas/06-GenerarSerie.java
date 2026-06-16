import java.util.Scanner;

class GenerarSerie {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(i + 1 + " ");
            }
        }

        leer.close();
    }
}
