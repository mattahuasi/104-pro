import java.util.Scanner;

class BuscarNumeroContinue {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero a buscar menor a 20: ");
        int numero = leer.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            if (numero == i) {
                continue;
            }
        }

        leer.close();
    }
}
