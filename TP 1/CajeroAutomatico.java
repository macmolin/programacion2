import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 9999999.0;
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    saldo = depositarDinero(scanner, saldo);
                    break;
                case 3:
                    saldo = retirarDinero(scanner, saldo);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n********** Cajero Automático **********");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.println("***************************************");
    }

    // Método para consultar el saldo
    public static void consultarSaldo(double saldo) {
        System.out.printf("Su saldo actual es: $%.2f%n", saldo);
    }

    // Método para depositar dinero
    public static double depositarDinero(Scanner scanner, double saldo) {
        System.out.print("Ingrese el monto a depositar: ");
        double deposito = scanner.nextDouble();

        if (deposito > 0) {
            saldo += deposito;
            System.out.printf("Depósito exitoso. Su nuevo saldo es: $%.2f%n", saldo);
        } else {
            System.out.println("Error: El monto debe ser mayor a 0.");
        }
        return saldo;
    }

    // Método para retirar dinero
    public static double retirarDinero(Scanner scanner, double saldo) {
        System.out.print("Ingrese el monto a retirar: ");
        double retiro = scanner.nextDouble();

        if (retiro > 0 && retiro <= saldo) {
            saldo -= retiro;
            System.out.printf("Retiro exitoso. Su nuevo saldo es: $%.2f%n", saldo);
        } else if (retiro > saldo) {
            System.out.println("Error: Saldo insuficiente.");
        } else {
            System.out.println("Error: El monto debe ser mayor a 0.");
        }
        return saldo;
    }
}