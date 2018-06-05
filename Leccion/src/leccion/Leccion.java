package leccion;

/**
 *
 * @author Juan Gahona - Scoowy
 */
public class Leccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        
        double[] arreglo3 = new double[arreglo1.length];
        double prom = 0;
        
        String reporte = String.format("%-12s%-12s%-12s\n", "Arreglo1", "Arreglo2", "Resultado");
        
        // Iteracion principal
        for (int i = 0; i < arreglo1.length; i++) {
            // ** Sin determinar todavia que es lo que tenemos que obtener ** Revisar y  corregir
            // arreglo3[i] = (arreglo1[i] + arreglo2[i]) / 2;
            
            // Obtenemos los datos del Arreglo3
            arreglo3[i] = arreglo1[i] / arreglo2[i];
            // Almacenamos los datos del Arreglo3 para promediarlo
            prom += arreglo3[i];
            // Generamos los "registros" del reporte
            reporte = String.format("%s%-12d%-12d%-12.2f\n", reporte, arreglo1[i], arreglo2[i], arreglo3[i]);
        }
        // Obtenemos el promedio del Arreglo3
        prom /= arreglo3.length;
        
        // Presentamos los resultados
        System.out.println(reporte);
        System.out.printf("El promedio del Arreglo3 es: %.2f\n", prom);
    }

}
