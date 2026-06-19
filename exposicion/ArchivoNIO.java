import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArchivoNIO {

    public static void main(String[] args) {
        // APERTURA (PREPARACIÓN): Path reemplaza a File para manejar rutas de forma moderna
        Path ruta = Path.of("./exposicion/archivo_nio.txt");

        // ----------------- ESCRITURA -----------------
        // Preparamos todo el texto que queremos guardar en un solo String
        String contenidoEscribir =
            "Texto escrito usando java.nio.file.Files.\n¡En una sola linea de código!";

        try {
            // APERTURA, ESCRITURA Y CIERRE: Todo esto ocurre automáticamente en este único método
            Files.writeString(ruta, contenidoEscribir);

            System.out.println(
                "Archivo creado y escrito exitosamente con NIO."
            );
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // ----------------- LECTURA -----------------
        try {
            // APERTURA, LECTURA COMPLETA Y CIERRE: Lee todo el documento de golpe y lo retorna como String
            String contenidoLeido = Files.readString(ruta);

            System.out.println("\nContenido leído:");

            // Imprimimos todo el bloque de texto completo
            System.out.println(contenidoLeido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
