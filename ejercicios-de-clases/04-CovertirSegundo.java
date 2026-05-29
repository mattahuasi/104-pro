import java.util.Scanner;

class ConvertirSegundo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double segundo, minuto, hora;

        System.out.print("Ingrese el número de segundos: ");
        segundo = entrada.nextInt();

        minuto = segundo / 60;
        hora = minuto / 60;

        System.out.println("El número de segundos ingresados es: " + segundo);
        System.out.println("Equivale a: " + minuto + " minutos");
        System.out.println("Equivale a: " + hora + " horas");

        entrada.close();
    }
}
