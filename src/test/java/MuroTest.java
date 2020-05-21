

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Roberto", "Se ha unido a la red");
        EntradaEvento entrada06 = new EntradaEvento("Christian", "Ha hecho una tortilla de patata");

        muro.addEntradaTexto(entrada01);
        muro.addEntradaFoto(entrada02);
        muro.addEntradaTexto(entrada03);
        muro.addEntradaFoto(entrada04);
        muro.addEntradaEvento(entrada05);
        muro.addEntradaEvento(entrada06);

        String comparacion = "Usuario: Nacho\nLikes: 0\nRecién llegado de mis vacaciones en Hawai!\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n" +
                "Usuario: Begoña\nLikes: 0\nEstá lloviendo ahí fuera...\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n" +
                "Usuario: Luis\nLikes: 0\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n" +
                "Usuario: Cristina\nLikes: 0\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n" +
                "Usuario: Roberto\nLikes: 0\nSe ha unido a la red\nEscrito hace 10 segundos\n\n\n" +
                "Usuario: Christian\nLikes: 0\nHa hecho una tortilla de patata\nEscrito hace 10 segundos\n\n\n";
        assertEquals(comparacion, muro.toString());
        System.out.println(muro);
    }
}