import java.util.Scanner;

class ContarDigitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        int cont = 0;

        if (n == 0) cont = 1;

        while (n > 0) {
            n /= 10;
            cont++;
        }

        System.out.println("Tiene " + cont + " dígitos.");
        sc.close();
    }
}
