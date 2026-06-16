import java.util.Scanner;

class AsignarBeca {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el promedio final: ");
        double promedioFinal = leer.nextDouble();
        System.out.print("Ingrese el ingreso familiar mensual: ");
        double ingresoFamiliar = leer.nextDouble();
        System.out.print("Ingrese cantidad de materias reprobadas: ");
        int materiasReprobadas = leer.nextInt();
        System.out.print("Ingrese el departamento de residencia: ");
        String departamento = leer.next();
        System.out.print(
            "Ingrese la distancia de la casa a la universidad en Kilometros: "
        );
        double distancia = leer.nextDouble();

        boolean becaExcelencia = false;
        boolean becaCompleta = false;
        String tipoBeca = "";

        if (promedioFinal < 0 || promedioFinal > 100) {
            System.out.println(
                "Promedio final inválido. Debe estar entre 0 y 100."
            );
        } else if (promedioFinal < 51) {
            tipoBeca = "Sin beca";
        } else if (materiasReprobadas > 2) {
            tipoBeca = "Sin beca";
        } else if (
            promedioFinal >= 90 &&
            materiasReprobadas == 0 &&
            ingresoFamiliar < 6000
        ) {
            becaExcelencia = true;
            tipoBeca = "Beca Excelencia";
        } else if (
            (promedioFinal >= 80 &&
                ingresoFamiliar <= 3500 &&
                distancia >= 25) ||
            departamento != "La Paz"
        ) {
            becaCompleta = true;
            tipoBeca = "Beca Completa";
        } else if (promedioFinal >= 65 && ingresoFamiliar <= 2500) {
            tipoBeca = "Sin Comedor";
        } else {
            tipoBeca = "Sin beca";
        }

        if (becaExcelencia && becaCompleta) {
            tipoBeca = "Beca Excelencia";
        }

        System.out.println("El tipo de beca asignada es: " + tipoBeca);

        leer.close();
    }
}
