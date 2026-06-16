import java.util.Scanner;

class SumaDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        int suma = 0;

        while (n > 0) {
            int digito = n % 10;
            suma += digito;
            n /= 10;
        }

        System.out.println(suma);
        scanner.close();
    }
}
