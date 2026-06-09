import java.util.Scanner;

class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();

        int i = 1;

        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while (i <= 10);

        leer.close();
    }
}
