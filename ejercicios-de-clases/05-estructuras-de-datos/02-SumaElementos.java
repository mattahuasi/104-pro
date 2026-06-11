import java.util.Scanner;

class SumaElementos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeros[] = new int[8];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + suma);

        leer.close();
    }
}
