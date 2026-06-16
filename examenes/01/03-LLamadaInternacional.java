import java.util.Scanner;

class LlamadaInterncional {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la duración de la llamada en minutos: ");
        double duracion = leer.nextDouble();

        System.out.print("Ingrese el país de destino : ");
        int paisDestino = leer.nextInt();

        double costoPorMinuto = 0;

        switch (paisDestino) {
            case 12:
                costoPorMinuto = 2;
                break;
            case 15:
                costoPorMinuto = 2.2;
                break;
            case 18:
                costoPorMinuto = 4.5;
                break;
            case 19:
                costoPorMinuto = 3.5;
                break;
            case 23:
                costoPorMinuto = 6;
                break;
            case 25:
                costoPorMinuto = 6;
                break;
            case 29:
                costoPorMinuto = 5;
                break;
            default:
                System.out.println("País de destino inválido.");
                break;
        }

        double costoTotal = duracion * costoPorMinuto;

        System.out.println("El costo total de la llamada es: $" + costoTotal);

        leer.close();
    }
}
