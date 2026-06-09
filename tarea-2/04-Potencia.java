import java.util.Scanner;

class Potencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base = ");
        int base = scanner.nextInt();
        System.out.print("Exponente = ");
        int exponente = scanner.nextInt();

        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println(resultado);
        scanner.close();
    }
}
