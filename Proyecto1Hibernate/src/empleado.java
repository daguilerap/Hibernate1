import java.text.SimpleDateFormat;
import java.util.Date;

public class empleado {
    int id;
    String apellido;
    String oficio;
    int dir;
    Date fecha;
    float salario;
    float comision;
    int numero_dep;

    public empleado(int id, String apellido, String oficio, int dir, Date fecha, float salario, float comision, int numero_dep) {
        this.id = id;
        this.apellido = apellido;
        this.oficio = oficio;
        this.dir = dir;
        this.fecha = fecha;
        this.salario = salario;
        this.comision = comision;
        this.numero_dep = numero_dep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public int getNumero_dep() {
        return numero_dep;
    }

    public void setNumero_dep(int numero_dep) {
        this.numero_dep = numero_dep;
    }
}
