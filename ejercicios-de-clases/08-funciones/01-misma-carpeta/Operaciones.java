public class Operaciones {

    // Función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static float multiplicar(float a, float b) {
        return a * b;
    }

    // Función para dividir dos números
    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
