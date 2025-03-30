import java.util.Scanner;

public class NumeroCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;


        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
            }
        } while (numero < 0);

        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        scanner.close();
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;


        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return original == invertido;
    }
}
