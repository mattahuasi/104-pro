import java.util.Scanner;

class MultiplosDeCinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 5 == 0) {
                contador++;
            }
        }

        System.out.println(
            "La cantidad de numeros multiplos de 5 es: " + contador
        );

        sc.close();
    }
}
