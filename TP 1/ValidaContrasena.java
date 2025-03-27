import java.util.Scanner;

public class ValidaContrasena {
    public static void main(String[] args) {
        int contrasena = 1234;

        Scanner ingreso = new Scanner(System.in);

        int cont = 1;
        int maxIntentos = 3;
        System.out.println("Por favor ingrese la contraseña: ");
        int prueba = ingreso.nextInt();

        while ( prueba != contrasena && cont < maxIntentos) {

            System.out.println("Contraseña incorrecta, por favor intente nuevamente");
            System.out.println("Le quedan " + (maxIntentos-cont) + " intentos");
            cont += 1;
            prueba = ingreso.nextInt();
        }

        ingreso.close();
        if (prueba == contrasena) {
            System.out.println("Contraseña CORRECTA");
        } else {
            System.out.println("Contraseña INCORRECTA");
        }
    }
}
