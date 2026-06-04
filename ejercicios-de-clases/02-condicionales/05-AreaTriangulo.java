import java.util.Scanner;

class AreaTriangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int A, B, C;

        System.out.println("Ingrese el valor del lado A: ");
        A = leer.nextInt();
        System.out.println("Ingrese el valor del lado B: ");
        B = leer.nextInt();
        System.out.println("Ingrese el valor del lado C: ");
        C = leer.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            double s = (A + B + C) / 2.0;
            double area = Math.sqrt(s * (s - A) * (s - B) * (s - C));
            System.out.println("El área del triángulo es: " + area);
        } else {
            System.out.println(
                "Los lados ingresados no forman un triángulo válido."
            );
        }

        leer.close();
    }
}
