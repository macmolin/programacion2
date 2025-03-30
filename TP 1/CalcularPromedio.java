import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {

        int suma = 0;
        int cont = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la nota o (-1) para salir del sistema: ");
        int nota = entrada.nextInt();

        while (nota != -1) {
            cont += 1;
            suma += nota;
            System.out.println("Ingrese la nueva nota o (-1) para salir del sistema: ");
            nota = entrada.nextInt();
        }

        entrada.close();
        int prom = suma / cont;

        System.out.println("El promedio de las notas ingresadas es: " + prom);

        if ( prom >= 6 ) {
            System.out.println("El alumno aprobo la materia");
        } else {
            System.out.println("El alumno NO aprobo la materia");
        }
    }
}
