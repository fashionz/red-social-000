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

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = super.toString();
        if(getComentarios().isEmpty()) {
            aDevolver = aDevolver + "No hay comentarios\n";
        }
        else {
            aDevolver = aDevolver + "Comentarios: ";
            for (String texto : getComentarios()) {
                aDevolver = aDevolver + "- " + texto + "\n";
            }
        }
        return aDevolver;
    }
}
