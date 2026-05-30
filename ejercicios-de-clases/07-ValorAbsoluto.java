import java.util.Scanner;

class ValorAbsoluto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int X;
        System.out.println("Ingrese un número:");
        X = leer.nextInt();

        if (X < 0) {
            X = (-1) * X;
        }

        System.out.println("El valor absoluto es: " + X);

        leer.close();
    }
}
