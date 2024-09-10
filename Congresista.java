public class Congresista {
    private int idCongresista;
    private String nombre;
    private String primerApellido;
    private String institucion;
    private String correoElectronico;
    private String telefonoMovil;

    public Congresista(int idCongresista, String nombre, String primerApellido, String institucion, String correoElectronico, String telefonoMovil) {
        this.idCongresista = idCongresista;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.institucion = institucion;
        this.correoElectronico = correoElectronico;
        this.telefonoMovil = telefonoMovil;
    }

    // Getters y Setters
    public int getIdCongresista() {
        return idCongresista;
    }

    public void setIdCongresista(int idCongresista) {
        this.idCongresista = idCongresista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
}
