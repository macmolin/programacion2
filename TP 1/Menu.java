import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("***********-Menu-************** ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir");
        System.out.println("5. Salir ");
        System.out.println("******************************* ");
        String opcion = scanner.nextln();

        System.out.println("Ingrese una opcion del Menú: ");

    static void sumar(){
            Scanner consola = new Scanner(System.in);
            int operando1, operando2;
            System.out.print("Operando1: ");
            operando1=consola.nextInt();
            System.out.print("Operando2: ");
            operando2=consola.nextInt();
            var resultado = operando1 + operando2;
            System.out.println("Suma de valores: "+resultado);
    }

        static void restar(){
            Scanner consola = new Scanner(System.in);
            int operando1, operando2;
            System.out.print("Operando1: ");
            operando1=consola.nextInt();
            System.out.print("Operando2: ");
            operando2=consola.nextInt();
            var resultado = operando1 - operando2;
            System.out.println("Resta de valores: "+resultado);
        }

        static void multiplicar(){
            Scanner consola = new Scanner(System.in);
            int operando1, operando2;
            System.out.print("Operando1: ");
            operando1=consola.nextInt();
            System.out.print("Operando2: ");
            operando2=consola.nextInt();
            var resultado = operando1 * operando2;
            System.out.println("Multiplicacion de valores: "+resultado);
        }

        static void dividir(){
            Scanner consola = new Scanner(System.in);
            int operando1, operando2;
            System.out.print("Operando1: ");
            operando1=consola.nextInt();
            System.out.print("Operando2: ");
            operando2=consola.nextInt();
            var resultado = operando1 / operando2;
            System.out.println("Division de valores: "+resultado);
        }


    static void menu(){
            int opcion;
        switch (opcion){
            case 1:
                System.out.println("Ingrese dos numeros para la suma:");
                sumar();
                break;
            case 2:
                System.out.println("Ingrese dos numeros para la resta:");
                restar();
                break;
            case 3:
                System.out.println("Ingrese dos numeros para la multiplicacion:");
                multiplicar();
                break;
            case 4:
                System.out.println("Ingrese dos numeros para la division:");
                dividir();
                break;
            case 5:
                System.out.println("Adiós");
                break;
            default:
                System.out.println("Ingrese una opcion valida");

        }
    }
}