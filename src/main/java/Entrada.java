import java.time.LocalDateTime;

public class Entrada {
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;

    public Entrada(String usuario) {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }

    public void meGusta() {
        cantidadMeGusta++;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }

    public String getTiempoPublicacion() {
        String aDevolver = "Escrito hace 10 segundos";
        return aDevolver;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    @Override
    public String toString() {
        return "";
    }
}
