import java.util.Scanner;

class NImpares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = leer.nextInt();

        int numero = 1;
        int contador = 1;

        while (contador <= n) {
            System.out.print(numero + ", ");
            numero = numero + 2;
            contador = contador + 1;
        }

        leer.close();
    }
}
