

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

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recien llegado de mis vacaciones en Hawai!");
        entrada01.addComentario("Que moreno vienes Nacho!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begona", "Esta lloviendo ahi fuera...");
        entrada03.addComentario("Cuidado no te mojes mucho jajaja");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Roberto", "Se ha unido a la red");
        EntradaEvento entrada06 = new EntradaEvento("Christian", "Ha hecho una tortilla de patata");

        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada05);
        muro.addEntrada(entrada06);

        String comparacion =
                "Usuario: Nacho\nLikes: 0\nEscrito hace 10 segundos\nComentarios: - Que moreno vienes Nacho!\nRecien llegado de mis vacaciones en Hawai!\n\n\n" +
                "Usuario: Luis\nLikes: 0\nEscrito hace 10 segundos\nNo hay comentarios\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\n\n\n" +
                "Usuario: Begona\nLikes: 0\nEscrito hace 10 segundos\nComentarios: - Cuidado no te mojes mucho jajaja\nEsta lloviendo ahi fuera...\n\n\n" +
                "Usuario: Cristina\nLikes: 0\nEscrito hace 10 segundos\nNo hay comentarios\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\n\n\n" +
                "Usuario: Roberto\nLikes: 0\nEscrito hace 10 segundos\nSe ha unido a la red\n\n\n" +
                "Usuario: Christian\nLikes: 0\nEscrito hace 10 segundos\nHa hecho una tortilla de patata\n\n\n";
        assertEquals(comparacion, muro.toString());
        System.out.println(muro);
    }
}