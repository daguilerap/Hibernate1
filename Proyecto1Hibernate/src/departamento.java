public class departamento {
    private int id;
    private String nombre;
    private String localidad;

    public departamento(int id, String nombre, String localidad) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
    }
    public departamento() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
