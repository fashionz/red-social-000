import java.util.ArrayList;
public class EntradaComentarios extends Entrada {

    private ArrayList<String> comentarios;

    public EntradaComentarios(String autor) {
        super(autor);
        comentarios = new ArrayList<>();
    }

    public void addComentario(String texto) {
        comentarios.add(texto);
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }
}
