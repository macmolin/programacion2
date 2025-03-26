import java.util.Random;
import java.util.Scanner;

public class JuegoNumeroSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("¡Bienvenido al juego del número secreto!");
        System.out.println("Adivina el número entre 1 y 100.");

        do {
            System.out.print("Ingrese su intento: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
            }
        } while (intento != numeroSecreto);

        scanner.close();
    }
}