import java.util.Scanner;

class CajaFuerte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave = 1234;
        int intentos = 4;
        boolean acertado = false;

        while (intentos > 0 && !acertado) {
            System.out.print("Ingrese combinación: ");
            int ingreso = sc.nextInt();

            if (ingreso == clave) {
                acertado = true;
                System.out.println(
                    "La caja fuerte se ha abierto satisfactoriamente"
                );
            } else {
                intentos--;
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
        sc.close();
    }
}
