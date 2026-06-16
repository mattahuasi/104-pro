import java.util.Scanner;

class BuscarNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.print("Escriba la contrasena: ");
            String contrasena = leer.nextLine();
            if (contrasena.equals("1234")) {
                System.out.println("Contrasena correcta");
                break;
            } else {
                System.out.println("Contrasena incorrecta, intente de nuevo.");
            }
        }

        leer.close();
    }
}
