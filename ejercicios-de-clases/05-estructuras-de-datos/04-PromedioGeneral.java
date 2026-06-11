import java.util.Scanner;

class PromedioGeneral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int sumaTotal = 0;
        int sumaPares = 0;
        int contadorPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
            sumaTotal += numeros[i];
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
                contadorPares++;
            }
        }

        int promedioGeneral = sumaTotal / n;
        int promedioPares = 0;

        if (contadorPares > 0) {
            promedioPares = sumaPares / contadorPares;
        }

        System.out.println("El promedio general es: " + promedioGeneral);
        System.out.println(
            "El promedio de los numeros pares es: " + promedioPares
        );

        sc.close();
    }
}
