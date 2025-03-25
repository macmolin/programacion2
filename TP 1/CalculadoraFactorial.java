import java.util.Scanner;

public class CalculadoraFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("\nEl número debe ser mayor a -1");
            }
        } while (numero < 0);

        int factorial = calcularFactorial(numero);
        System.out.println("\nEl factorial del número " + numero + " es: " + factorial);

        scanner.close();
    }

    // Método para calcular el factorial
    public static int calcularFactorial(int numero) {
        int factorial = 0;

        for (int i = 0; i < numero; i++) {
            if (i == 0) {
                factorial = 1;
            }
            else{
                factorial += factorial * i;
            }
        }

        return factorial;
    }
}