import java.util.Scanner;

class Factorial {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = leer.nextInt();
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);

        leer.close();
    }
}
