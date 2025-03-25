import java.util.Scanner;

public class ConversorCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calificacion;

        // Solicitar una calificación válida entre 1 y 10
        do {
            System.out.print("Ingrese una calificación (1-10): ");
            calificacion = scanner.nextInt();
            if (calificacion < 1 || calificacion > 10) {
                System.out.println("Error: La calificación debe estar entre 1 y 10.");
            }
        } while (calificacion < 1 || calificacion > 10);

        // Obtener y mostrar la descripción de la calificación
        String descripcion = obtenerDescripcion(calificacion);
        System.out.println("Calificación: " + calificacion + " - " + descripcion);

        scanner.close();
    }

    // Método para obtener la descripción textual de la calificación
    public static String obtenerDescripcion(int calificacion) {
        if (calificacion >= 1 && calificacion <= 3) {
            return "Insuficiente";
        } else if (calificacion >= 4 && calificacion <= 5) {
            return "Regular";
        } else if (calificacion >= 6 && calificacion <= 7) {
            return "Bueno";
        } else if (calificacion >= 8 && calificacion <= 9) {
            return "Muy Bueno";
        } else {
            return "Excelente";
        }
    }
}