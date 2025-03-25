import java.util.Scanner;

public class SumaParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedir un número positivo al usuario
        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Error: Debe ingresar un número positivo mayor que 0.");
            }
        } while (numero <= 0);

        // Calcular sumas de pares e impares
        int sumaPares = calcularSuma(numero, true);
        int sumaImpares = calcularSuma(numero, false);

        // Mostrar resultados
        System.out.println("Suma de los números pares hasta " + numero + ": " + sumaPares);
        System.out.println("Suma de los números impares hasta " + numero + ": " + sumaImpares);

        scanner.close();
    }

    // Método para calcular la suma de pares o impares
    public static int calcularSuma(int numero, boolean esPar) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            if ((i % 2 == 0) == esPar) {
                suma += i;
            }
        }
        return suma;
    }
}
