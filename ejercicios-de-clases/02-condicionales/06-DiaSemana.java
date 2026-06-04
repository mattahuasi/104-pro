import java.util.Scanner;

class DiaSemana {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println(
                    "Número inválido. Por favor, ingrese un número del 1 al 7."
                );
                break;
        }

        entrada.close();
    }
}
