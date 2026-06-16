import java.util.Scanner;

class NumeroInvertido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        int invertido = 0;

        while (n > 0) {
            int digito = n % 10;
            invertido = (invertido * 10) + digito;
            n /= 10;
        }

        System.out.println(invertido);
        scanner.close();
    }
}
