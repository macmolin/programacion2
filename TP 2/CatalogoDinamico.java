import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CatalogoDinamico {

    public static void main(String[] args) {

        ArrayList<Integer> coincidencias = new ArrayList<>();
        ArrayList<String> catalogo = new ArrayList<>();
        Scanner ingreso = new Scanner(System.in);

        // Cargamos el vector
        System.out.println("Ingrese el nombre de un libro o la palabra \"ESC\" para terminar la carga: ");
        String libro = ingreso.nextLine();

        while (!libro.equalsIgnoreCase("ESC"))  {
            catalogo.add(libro);
            System.out.println("Ingrese un nuevo libro o la palabra [ESC] para terminar la carga: ");
            libro = ingreso.nextLine();
        }

        // Pedimos la palabra o frase al usuario
        System.out.println("Ingrese la palabra o frase a buscar: ");
        String palabra = ingreso.next();
        ingreso.close();

        // Reccorremos el vector
        for (int x = 0; x < catalogo.size(); x++) {
            if ((catalogo.get(x).toLowerCase()).contains(palabra.toLowerCase())) {
                coincidencias.add(x);
            }
        }

        // Imprimimos las posibles coincidencias
        if (coincidencias.isEmpty()) {
            System.out.println("No se encontraron titulos con esas coincidencias.");
        } else {
            System.out.println("Se encontraron las siguientes coincidencias: ");
            for (int y=0; y < coincidencias.size(); y++) {
                System.out.println("En la posicion " + coincidencias.get(y) + ": " + catalogo.get(coincidencias.get(y)));
            }
        }

    }
}
