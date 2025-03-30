import java.util.Scanner;

public class RegistroNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear la matriz 5x4 para almacenar las notas (5 alumnos, 4 materias)
        int[][] notas = new int[5][4];
        double[] promedios = new double[5];
        int indiceMejorAlumno = 0;
        double mayorPromedio = 0;

        // Cargar las notas de los estudiantes
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese las notas para el estudiante " + (i + 1) + ":");
            int sumaNotas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Materia " + (j + 1) + ": ");
                notas[i][j] = scanner.nextInt();
                sumaNotas += notas[i][j];
            }
            // Calcular el promedio del alumno
            promedios[i] = sumaNotas / 4.0;

            // Verificar si el alumno tiene el mayor promedio
            if (promedios[i] > mayorPromedio) {
                mayorPromedio = promedios[i];
                indiceMejorAlumno = i;
            }
        }

        // Mostrar el promedio de cada alumno
        System.out.println("\nPromedios por alumno:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
        }

        // Indicar el alumno con el mayor promedio
        System.out.println("\nEl alumno con el mayor promedio es el estudiante " + (indiceMejorAlumno + 1) + " con un promedio de: " + mayorPromedio);

        scanner.close();
    }
}
