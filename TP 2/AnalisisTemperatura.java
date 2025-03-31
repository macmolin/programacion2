import java.util.Random;

public class AnalisisTemperaturas {

    public static void main(String[] args) {

        int sum = 0;
        int minD = 15;
        int maxD = 30;
        int[] max = new int[2];
        int[] min = new int[2];
        int[][] mes = new int[4][7];
        String[] semana = {"Primer", "Segunda", "Tercer", "Cuarta"};
        String[] dia = {"Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"};
        String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        Random random = new Random();
        // Cargamos el mes
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                mes[i][j] = random.nextInt(15,30);
            }
        }

        // Imprimimos el mes
        System.out.println("Temperaturas del mes: ");
        for (int j = 0; j < 7; j++) {
            System.out.print(" " + dia[j]);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d", mes[i][j]);
            }
            System.out.println();
        }

        // Recorremos la matriz y buscamos valores

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                // Temperatura media
                sum = sum + mes[i][j];
                // Temperatura minima
                if (mes[i][j] > minD) {
                    max[0] = i;
                    max[1] = j;
                    minD = mes[i][j];
                }
                // Temperatura maxima
                if (mes[i][j] < maxD) {
                    min[0] = i;
                    min[1] = j;
                    maxD = mes[i][j];
                }
            }
        }
        // Tempertura media Mensual
        System.out.println();
        System.out.println("El promedio de temperatura del mes fue: " + (sum/28) + "°C.");

        // Temperatura MAYOR
        System.out.println("El Dia con mayor tempetura fue el " + dias[max[1]] + " de la " + semana[(max[0] + 1)]+ " semana.");

        // Temperatura MENOR
        System.out.println("El Dia con menor tempetura fue el " + dias[min[1]] + " de la " + semana[(min[0] + 1)]+ " semana.");

    }
}
