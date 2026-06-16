import java.util.Scanner;

class EstadisticasParesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0,
            sumImp = 0,
            contImp = 0,
            maxPar = 0;
        System.out.print("Número: ");
        int n = sc.nextInt();

        while (n >= 0) {
            cont++;
            if (n % 2 == 0) {
                if (n > maxPar) maxPar = n;
            } else {
                sumImp += n;
                contImp++;
            }
            n = sc.nextInt();
        }

        System.out.println("Total introducidos: " + cont);
        if (contImp > 0) System.out.println(
            "Media impares: " + (sumImp / (double) contImp)
        );
        System.out.println("Mayor par: " + maxPar);
        sc.close();
    }
}
