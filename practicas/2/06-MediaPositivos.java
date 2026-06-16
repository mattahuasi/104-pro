import java.util.Scanner;

class MediaPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int cont = 0;

        System.out.print("Ingrese número: ");
        double n = sc.nextDouble();

        while (n >= 0) {
            suma += n;
            cont++;
            System.out.print("Ingrese número: ");
            n = sc.nextDouble();
        }

        if (cont > 0) {
            System.out.println("Media: " + (suma / cont));
        }
        sc.close();
    }
}
