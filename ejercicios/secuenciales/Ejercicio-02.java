import java.util.Scanner;

class Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        int radio = leer.nextInt();
        System.out.println("Ingrese la generatriz: ");
        int generatriz = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        int altura = leer.nextInt();

        double AB = Math.PI * Math.pow(radio, 2);
        double AL = Math.PI * radio * generatriz;
        double AT = AB + AL;
        double VOL = (1.0 / 3.0) * AB * altura;

        System.out.println("El area de la base es: " + AB);
        System.out.println("El area lateral es: " + AL);
        System.out.println("El area total es: " + AT);
        System.out.println("El volumen es: " + VOL);

        leer.close();
    }
}
