import java.Scanner;

public class Fiboncci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor a mostrar: ");
        int value = ingreso.nextInt();
        ingreso.close();

        System.out.println(f1);
        System.out.println(f2);
        for(int i = 0; i < value; i++) {
            int aux = f1 + f2;
            f1 = f2;
            f2 = aux;
            System.out.println(aux);
        }
    }
}
