import java.util.Scanner;

public class InventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de productos (n) y depósitos (m)
        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese la cantidad de depósitos: ");
        int m = scanner.nextInt();

        // Crear una matriz para almacenar la cantidad de productos por depósito
        int[][] inventario = new int[n][m];
        int[] stockTotalPorProducto = new int[n];
        int[] stockPorDeposito = new int[m];
        int depositoConMayorStock = 0;
        int mayorStock = 0;

        // Cargar las cantidades disponibles por producto y depósito
        for (int i = 0; i < n; i++) {
            System.out.println("\nCargar stock para el producto " + (i + 1) + ":");
            int stockTotalProducto = 0;
            for (int j = 0; j < m; j++) {
                System.out.print("Depósito " + (j + 1) + ": ");
                inventario[i][j] = scanner.nextInt();
                stockTotalProducto += inventario[i][j];
                stockPorDeposito[j] += inventario[i][j];
            }
            stockTotalPorProducto[i] = stockTotalProducto;
        }

        // Mostrar el stock total por producto
        System.out.println("\nStock total por producto:");
        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stockTotalPorProducto[i]);
        }

        // Encontrar el depósito con mayor cantidad acumulada de productos
        for (int i = 0; i < m; i++) {
            if (stockPorDeposito[i] > mayorStock) {
                mayorStock = stockPorDeposito[i];
                depositoConMayorStock = i;
            }
        }

        // Mostrar el depósito con mayor cantidad de productos
        System.out.println("\nEl depósito con mayor cantidad acumulada de productos es el Depósito " + (depositoConMayorStock + 1) + " con " + mayorStock + " productos.");

        scanner.close();
    }
}