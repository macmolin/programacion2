import java.util.Stack;

public class ConvertidorInfijoAPostfijo {

    public static String convertirAPostfijo(String expresionInfija) {
        StringBuilder expresionPostfija = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresionInfija.length(); i++) {
            char caracter = expresionInfija.charAt(i);

            // Ignorar espacios
            if (caracter == ' ') {
                continue;
            }

            // Si es un operando (letra o número), agregar a la salida
            if (Character.isLetterOrDigit(caracter)) {
                expresionPostfija.append(caracter);
            }

            // Si es paréntesis de apertura
            else if (caracter == '(') {
                pila.push(caracter);
            }

            // Si es paréntesis de cierre
            else if (caracter == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    expresionPostfija.append(pila.pop());
                }
                pila.pop(); // Eliminar el '(' de la pila
            }

            // Si es operador
            else if (esOperador(caracter)) {
                while (!pila.isEmpty() && precedencia(pila.peek()) >= precedencia(caracter)) {
                    expresionPostfija.append(pila.pop());
                }
                pila.push(caracter);
            }
        }

        // Vaciar pila restante
        while (!pila.isEmpty()) {
            expresionPostfija.append(pila.pop());
        }

        return expresionPostfija.toString();
    }

    // Determina si el carácter es un operador válido
    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Asigna precedencia a los operadores
    private static int precedencia(char operador) {
        switch (operador) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return 0;
        }
    }
}