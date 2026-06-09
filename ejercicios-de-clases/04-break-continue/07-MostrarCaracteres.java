import java.util.Scanner;

class MostrarCaracteres {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = leer.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }

        leer.close();
    }
}
