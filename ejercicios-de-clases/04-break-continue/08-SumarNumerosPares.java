import java.util.Scanner;

class SumarNumerosPares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero grande: ");
        long numero = leer.nextLong();

        long suma = 0L;
        String numerosPares = "";

        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 == 0) {
                suma = suma + digito;
                numerosPares = digito + " " + numerosPares;
            }
            numero = numero / 10;
        }

        System.out.println("Los numeros pares son: " + numerosPares);
        System.out.println("La suma de los numeros pares es: " + suma);

        leer.close();
    }
}
