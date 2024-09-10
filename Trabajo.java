import java.util.List;

public class Trabajo {
    private int idTrabajo;
    private String titulo;
    private String abstracto;
    private List<Congresista> autores;

    public Trabajo(int idTrabajo, String titulo, String abstracto) {
        this.idTrabajo = idTrabajo;
        this.titulo = titulo;
        this.abstracto = abstracto;
    }

    // Getters y Setters
    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAbstracto() {
        return abstracto;
    }

    public void setAbstracto(String abstracto) {
        this.abstracto = abstracto;
    }

    public List<Congresista> getAutores() {
        return autores;
    }

    public void setAutores(List<Congresista> autores) {
        this.autores = autores;
    }
}
