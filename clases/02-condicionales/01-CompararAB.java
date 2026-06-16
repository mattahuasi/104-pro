import java.util.Scanner;

class CompararAB {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int A, B, R;
        System.out.println("Ingrese el valor de A:");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B:");
        B = leer.nextInt();

        if (A > B) {
            R = A - B;
        } else {
            R = B - A;
        }

        System.out.println("El resultado es: " + R);

        leer.close();
    }
}
