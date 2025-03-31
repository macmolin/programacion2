import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoFijo {

    public static void main(String[] args) {

        ArrayList<Integer> coincidencias = new ArrayList<>();
        String[] catalogo = {
                "Las fuerzas contrarias",
                "Franco",
                "Oposición",
                "La península de las casas vacías",
                "El albatros negro",
                "El español que enamoró al mundo",
                "En el amor y en la guerra",
                "El plan maestro",
                "Escalera interior",
                "Hombre caído"
        };

        // Pedimos la palabra o frase al usuario
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese la palabra o frase a buscar: ");
        String palabra = ingreso.next();
        ingreso.close();

        // Reccorremos el vector
        for (int x = 0; x < 10; x++) {
            if ((catalogo[x].toLowerCase()).contains(palabra.toLowerCase())) {
                coincidencias.add(x);
            }
        }

        // Imprimimos las posibles coincidencias
        if (coincidencias.isEmpty()) {
            System.out.println("No se encontraron titulos con esas coincidencias.");
        } else {
            System.out.println("Se encontraron las siguientes coincidencias: ");
            for (int y=0; y < coincidencias.size(); y++) {
                System.out.println("En la posicion " + coincidencias.get(y) + ": " + catalogo[coincidencias.get(y)]);
            }
        }

    }
}
