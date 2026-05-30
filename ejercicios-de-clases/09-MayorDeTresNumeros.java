import java.util.Scanner;

class MayorDeTresNumers {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int A, B, C;

        System.out.println("Ingrese el valor de A:");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B:");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C:");
        C = leer.nextInt();

        if (A > B && A > C) {
            System.out.println("El número mayor es: " + A);
        } else {
            if (B > C) {
                System.out.println("El número mayor es: " + B);
            } else {
                System.out.println("El número mayor es: " + C);
            }
        }

        leer.close();
    }
}
