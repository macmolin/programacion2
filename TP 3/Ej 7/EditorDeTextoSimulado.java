import java.util.Scanner;
import java.util.Stack;

public class EditorDeTextoSimulado {
    private Stack<String> pilaDeshacer;
    private Stack<String> pilaRehacer;
    private String textoActual;

    public EditorDeTextoSimulado() {
        pilaDeshacer = new Stack<>();
        pilaRehacer = new Stack<>();
        textoActual = "";
    }

    // Método para agregar texto (simula una acción del usuario)
    public void escribir(String nuevoTexto) {
        pilaDeshacer.push(textoActual);
        textoActual += nuevoTexto;
        pilaRehacer.clear();
    }

    // Método para deshacer la última acción
    public void deshacer() {
        if (!pilaDeshacer.isEmpty()) {
            pilaRehacer.push(textoActual);
            textoActual = pilaDeshacer.pop();
        } else {
            System.out.println("Nada para deshacer.");
        }
    }

    // Método para rehacer la última acción deshecha
    public void rehacer() {
        if (!pilaRehacer.isEmpty()) {
            pilaDeshacer.push(textoActual);
            textoActual = pilaRehacer.pop();
        } else {
            System.out.println("Nada para rehacer.");
        }
    }

    public String obtenerTexto() {
        return textoActual;
    }

    public static void main(String[] args) {
        EditorDeTextoSimulado editor = new EditorDeTextoSimulado();
        Scanner entrada = new Scanner(System.in);

        String opcion;

        do {
            System.out.println("\nTexto actual: \"" + editor.obtenerTexto() + "\"");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce el texto a agregar: ");
                    String texto = entrada.nextLine();
                    editor.escribir(texto);
                    break;
                case "2":
                    editor.deshacer();
                    break;
                case "3":
                    editor.rehacer();
                    break;
                case "4":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (!opcion.equals("4"));

        entrada.close();
    }
}