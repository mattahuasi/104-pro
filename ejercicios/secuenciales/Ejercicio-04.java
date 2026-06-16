import java.util.Scanner;

class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el lado del hexaedro o cubo: ");
        int L = leer.nextInt();

        double AB = Math.pow(L, 2);
        double AL = 4 * Math.pow(L, 2);
        double AT = 6 * Math.pow(L, 2);
        double V = Math.pow(L, 3);

        System.out.println("El area de la base es: " + AB);
        System.out.println("El area lateral es: " + AL);
        System.out.println("El area total es: " + AT);
        System.out.println("El volumen es: " + V);

        leer.close();
    }
}
