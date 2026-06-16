class Operaciones {

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

    public static void main(String[] args) {
        int suma;
        suma = sumar(5, 5);
        System.out.println("\nSuma es: " + suma);
        System.out.println("\n------------------------------");
        System.out.println("\nLa suma es 2da = " + sumar(6, 6));
        System.out.println("La resta " + restar(5, 2));
        System.out.println("La multiplicación " + multiplicar(34.5f, 10.5f));
        System.out.println("La división " + dividir(45.3, 12.3));
    }
}
