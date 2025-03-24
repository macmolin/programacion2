import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            System.out.print("Ingrese una opción del Menú: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese dos números para la suma:");
                    operar(scanner, "sumar");
                    break;
                case 2:
                    System.out.println("Ingrese dos números para la resta:");
                    operar(scanner, "restar");
                    break;
                case 3:
                    System.out.println("Ingrese dos números para la multiplicación:");
                    operar(scanner, "multiplicar");
                    break;
                case 4:
                    System.out.println("Ingrese dos números para la división:");
                    operar(scanner, "dividir");
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n***********-Menú-************** ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir");
        System.out.println("5. Salir ");
        System.out.println("******************************* ");
    }

    // Método genérico para operar
    public static void operar(Scanner scanner, String operacion) {
        System.out.print("Operando 1: ");
        int operando1 = scanner.nextInt();
        System.out.print("Operando 2: ");
        int operando2 = scanner.nextInt();
        
        int resultado = 0;
        boolean valido = true;

        switch (operacion) {
            case "sumar":
                resultado = operando1 + operando2;
                break;
            case "restar":
                resultado = operando1 - operando2;
                break;
            case "multiplicar":
                resultado = operando1 * operando2;
                break;
            case "dividir":
                if (operando2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                    valido = false;
                } else {
                    resultado = operando1 / operando2;
                }
                break;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);
        }
    }
}