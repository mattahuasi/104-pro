public class Main {

    public static void main(String[] args) {
        int suma;
        suma = Operaciones.sumar(5, 5);
        System.out.println("\nSuma es: " + suma);
        System.out.println("\n------------------------------");
        System.out.println("\nLa suma es 2da = " + Operaciones.sumar(6, 6));
        System.out.println("La resta " + Operaciones.restar(5, 2));
        System.out.println(
            "La multiplicación " + Operaciones.multiplicar(34.5f, 10.5f)
        );
        System.out.println("La división " + Operaciones.dividir(45.3, 12.3));
    }
}
