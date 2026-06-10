import java.util.Scanner;

class ConvertirMedidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Ingrese una de las opciones:");
            System.out.println("1. m a cm");
            System.out.println("2. cm a m");
            System.out.println("3. km a m");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            if (opcion == 4) {
                break;
            }

            System.out.println();
            System.out.print("Ingrese un valor: ");
            double valor = sc.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println(valor * 100 + " cm");
                    break;
                case 2:
                    System.out.println();
                    System.out.println(valor / 100 + " m");
                    break;
                case 3:
                    System.out.println();
                    System.out.println(valor * 1000 + "m");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println();
        } while (opcion != 4);

        sc.close();
    }
}
