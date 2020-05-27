import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro {

    private ArrayList<Entrada> entradas;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicializa mensajes y fotos.
        entradas = new ArrayList<>();
    }

    /**
     * Anade una entrada de evento al muro.
     * @param entrada La entrada de evento a anadir.
     */
    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    /**
     * Muestra los detalles de todas las entradas añadidas
     * al muro en el orden en el que fueron añadidas.
     */
    public void mostrarDetallesTodasLasEntradas() {
        for (Entrada entrada : entradas) {
            entrada.mostrarDetallesPorPantalla();
        }
    }

    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n\n";
        }
        return aDevolver;
    }
}