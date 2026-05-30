import java.util.Scanner;

class Modulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int A;
        System.out.println("Ingrese un número:");
        A = leer.nextInt();

        if (A % 2 == 0) {
            System.out.println("El " + A + " número es par.");
        } else {
            System.out.println("El " + A + " número es impar.");
        }

        leer.close();
    }
}
