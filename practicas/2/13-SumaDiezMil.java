import java.util.Scanner;

class SumaDiezMil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int cont = 0;

        while (suma <= 10000) {
            System.out.print("Número: ");
            int n = sc.nextInt();
            suma += n;
            cont++;
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad: " + cont);
        System.out.println("Media: " + ((double) suma / cont));
        sc.close();
    }
}
