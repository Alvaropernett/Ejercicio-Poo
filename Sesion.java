import java.time.LocalDateTime;
import java.util.List;

public class Sesion {
    private int idSesion;
    private LocalDateTime diaHora;
    private String sala;
    private List<Trabajo> trabajos;
    private Congresista ponente;
    private Congresista chairman;

    public Sesion(int idSesion, LocalDateTime diaHora, String sala, String tema) {
        this.idSesion = idSesion;
        this.diaHora = diaHora;
        this.sala = sala;
    }

    // Getters y Setters
    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public LocalDateTime getDiaHora() {
        return diaHora;
    }

    public void setDiaHora(LocalDateTime diaHora) {
        this.diaHora = diaHora;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    public List<Trabajo> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(List<Trabajo> trabajos) {
        this.trabajos = trabajos;
    }

    public Congresista getPonente() {
        return ponente;
    }

    public void setPonente(Congresista ponente) {
        this.ponente = ponente;
    }

    public Congresista getChairman() {
        return chairman;
    }

    public void setChairman(Congresista chairman) {
        this.chairman = chairman;
    }
}
