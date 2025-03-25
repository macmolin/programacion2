import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedir un número positivo al usuario
        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Error: Debe ingresar un número positivo.");
            }
        } while (numero < 0);

        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");

        scanner.close();
    }

    // Método para contar la cantidad de dígitos de un número
    public static int contarDigitos(int numero) {
        int contador = 0;
        do {
            numero /= 10;
            contador++;
        } while (numero > 0);
        return contador;
    }
}