class MayorDeDos {

    // Funcion que calcule el mayor de dos
    public static int mayorDeDos(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nEl mayor es " + mayorDeDos(6, 11));
    }
}
