import java.util.Stack;

public class ValidadorParentesis {

    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            // Si es un símbolo de apertura, lo apilamos
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            }

            // Si es un símbolo de cierre, verificamos si hay coincidencia con el tope de la pila
            else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false; // Hay un cierre sin apertura correspondiente
                }

                char tope = pila.pop();

                if (!esParCoincidente(tope, caracter)) {
                    return false; // No coinciden los tipos de paréntesis
                }
            }
        }

        // Si la pila está vacía, todo está balanceado
        return pila.isEmpty();
    }

    // Método auxiliar para verificar si un par de símbolos es coincidente
    private static boolean esParCoincidente(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
}