import java.util.Scanner;

public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        int vocales = 0;
        int consonantes = 0;

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.substring(i, i + 1); // Obtener el carácter como String
            char c = letra.charAt(0); // Convertirlo a char

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
            else if (c >= 'a' && c <= 'z') {
                consonantes++;
            }
        }

        // Mostrar resultados
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        scanner.close();
    }
}
