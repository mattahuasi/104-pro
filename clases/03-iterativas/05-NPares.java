import java.util.Scanner;

class NPares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }

        leer.close();
    }
}
