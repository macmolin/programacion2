import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es primo
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }

    // Método para determinar si un número es primo SIN Math.sqrt(n)
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {  // Recorremos hasta n-1
            if (n % i == 0) {
                return false; // Tiene un divisor, no es primo
            }
        }
        return true;
    }
}
