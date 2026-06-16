import java.util.Scanner;

class LeerEnteros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        leer.close();
    }
}
