import java.util.Scanner;

class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("¿El plato tiene grasa? (True/False)");
        boolean tiene_grasa = leer.nextBoolean();

        if (tiene_grasa) {
            System.out.println("Lavar con agua caliente y mucho jabón.");
        } else {
            System.out.println("Lavar con agua fría y jabón normal.");
        }

        System.out.println("Enjuagar y secar el plato.");

        leer.close();
    }
}
