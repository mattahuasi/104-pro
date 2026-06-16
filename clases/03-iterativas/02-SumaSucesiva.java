import java.util.Scanner;

class SumaSucesiva {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese A: ");
        int A = leer.nextInt();
        System.out.print("Ingrese B: ");
        int B = leer.nextInt();

        int P = 0;
        for (int i = 1; i <= B; i++) {
            P = P + A;
        }
        System.out.println("El resultado de " + A + " * " + B + " es: " + P);

        leer.close();
    }
}
