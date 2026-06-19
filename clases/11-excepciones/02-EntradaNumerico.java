import java.util.Scanner;

class EntradaNumerico {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        do {
            try {
                System.out.print("Ingrese un numero: ");
                n = leer.nextInt();

                if (n > 0) {
                    System.out.println("Numero ingresado: " + n);
                    break;
                } else {
                    System.out.println("El numero debe ser mayor a cero");
                }
            } catch (Exception e) {
                System.out.println("Dato incorrecto");
                System.out.println("Mensaje: " + e.getClass().getSimpleName());
                leer.nextLine(); // Limpiar buffer
            }
        } while (true);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        leer.close();
    }
}
