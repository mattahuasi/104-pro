import java.util.Scanner;

class MultiplicarDigitos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo: ");
        int n = leer.nextInt();

        int p = 1;

        while (n > 0) {
            int d = n % 10;
            p = p * d;
            n = n / 10;
        }

        System.out.println(p);

        leer.close();
    }
}
