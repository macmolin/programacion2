import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una expresión infija (ej. A + B * C): ");
        String expresionInfija = entrada.nextLine();

        String expresionPostfija = ConvertidorInfijoAPostfijo.convertirAPostfijo(expresionInfija);

        System.out.println("Expresión postfija: " + expresionPostfija);

        entrada.close();
    }
}