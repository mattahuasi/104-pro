class TablaDeMultiplicar {

    // void no retorna, pero ejecuta alguna tarea
    // funcion calcular la tabla de multiplicar hasta 10, de un numero N entero
    // tambien se le conoce como PROCEDIMIENTO
    public static void tablaMultiplicar(int N) {
        System.out.println("\n-------------------------------");
        System.out.println("Tabla de multiplicar de: " + N);
        System.out.println("-------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }

    public static void main(String[] args) {
        tablaMultiplicar(5);
    }
}
