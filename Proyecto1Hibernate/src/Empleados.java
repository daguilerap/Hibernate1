import java.io.Serializable;
import java.util.Date;

public class Empleados {
    private Integer numemp;
    private String ape;
    private String of;
    private Integer dir;
    private Date fecha;
    private Float salar;
    private Float comis;
    private Integer numdpt;



    public Empleados() {

    }

    public Empleados(Integer numemp, String ape, String of, Integer dir, Date fecha, Float salar, Float comis, Integer numdpt) {
        this.numemp = numemp;
        this.ape = ape;
        this.of = of;
        this.dir = dir;
        this.fecha = fecha;
        this.salar = salar;
        this.comis = comis;
        this.numdpt = numdpt;
    }

    public Integer getNumemp() {
        return numemp;
    }

    public void setNumemp(Integer numemp) {
        this.numemp = numemp;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getOf() {
        return of;
    }

    public void setOf(String of) {
        this.of = of;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getSalar() {
        return salar;
    }

    public void setSalar(Float salar) {
        this.salar = salar;
    }

    public Float getComis() {
        return comis;
    }

    public void setComis(Float comis) {
        this.comis = comis;
    }

    public Integer getNumdpt() {
        return numdpt;
    }

    public void setNumdpt(Integer numdpt) {
        this.numdpt = numdpt;
    }
}
