import java.util.Scanner;

class Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Desmontar la llanta y sacar la cámara.");
        System.out.println("¿El agujero es demasiado grande? (True/False)");
        boolean agujero_grande = leer.nextBoolean();

        if (agujero_grande) {
            System.out.println("Reemplazar la cámara por una nueva.");
        } else {
            System.out.println("Lijar, poner pegamento y colocar un parche.");
        }

        System.out.println("Inflar la llanta y montar en la bicicleta.");

        leer.close();
    }
}
