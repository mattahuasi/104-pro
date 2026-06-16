import java.util.Scanner;

class SumarHastaIngresarCero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            suma = suma + numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
        leer.close();
    }
}
