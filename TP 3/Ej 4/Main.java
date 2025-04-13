public class Main {
    public static void main(String[] args) {
        String expresion1 = "{[5 * (3 + 2)] - (4 / 2)}";
        String expresion2 = "{[(3 + 2]) * (4 - 1)}";
        String expresion3 = "((3 + 2) * 4 - 1";
        String expresion4 = "[{()}]";

        System.out.println("Expresión 1: " + ValidadorParentesis.estaBalanceado(expresion1));
        System.out.println("Expresión 2: " + ValidadorParentesis.estaBalanceado(expresion2));
        System.out.println("Expresión 3: " + ValidadorParentesis.estaBalanceado(expresion3)); 
        System.out.println("Expresión 4: " + ValidadorParentesis.estaBalanceado(expresion4));
    }
}