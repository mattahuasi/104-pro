class Excepciones {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("El resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            System.out.println("Mensaje: " + e.getClass().getSimpleName());
        }
        System.out.println("Fin del programa");
    }
}
