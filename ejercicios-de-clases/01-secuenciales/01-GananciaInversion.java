import java.util.Scanner;

class GananciaInversion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double interes = 0.02;
        int dias = 0;
        int capital = 0;
        double ganancia = 0;
        System.out.println("Teclear capital");
        capital = entrada.nextInt();
        System.out.println("Teclear dias");
        dias = entrada.nextInt();
        ganancia = capital * interes * dias;
        System.out.println(
            "La ganancia de la inversion  con capital de " +
                capital +
                " Bs., a una tasa de interes del 2% y por un periodo de " +
                dias +
                " dias es de: " +
                ganancia +
                " Bs."
        );
        entrada.close();
    }
}
