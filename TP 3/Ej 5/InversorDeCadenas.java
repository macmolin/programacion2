import java.util.Scanner;
import java.util.Stack;

public class InversorDeCadenas {

    public static String invertirCadena(String textoOriginal) {
        Stack<Character> pila = new Stack<>();

        // Apilar cada carácter
        for (char caracter : textoOriginal.toCharArray()) {
            pila.push(caracter);
        }

        // Desapilar y construir la cadena invertida
        StringBuilder textoInvertido = new StringBuilder();

        while (!pila.isEmpty()) {
            textoInvertido.append(pila.pop());
        }

        return textoInvertido.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = entrada.nextLine();

        String resultado = invertirCadena(texto);

        System.out.println("Cadena invertida: " + resultado);

        entrada.close();
    }
}