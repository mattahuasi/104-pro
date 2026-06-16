class SumaArreglo {

    public static int sumaArreglo(int[] arreglo) {
        int suma = 0;
        for (int i : arreglo) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50 };
        int resultado = sumaArreglo(numeros);
        System.out.println("\nLa suma es: " + resultado);
    }
}
