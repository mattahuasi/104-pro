import java.util.Scanner;

class Ejercicio09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = leer.nextInt();

        if (numero > 0) {
            System.out.println("El número es POSITIVO");
        } else {
            if (numero < 0) {
                System.out.println("El número es NEGATIVO");
            } else {
                System.out.println("El número es NULO (Cero)");
            }
        }

        leer.close();
    }
}
