public class Departamentos {
    private Integer numdept;
    private String nombredept;
    private String local;

    public Departamentos(Integer numdept, String nombredept, String local) {
        this.numdept = numdept;
        this.nombredept = nombredept;
        this.local = local;
    }

    public Departamentos() {

    }

    public int getNumdept() {
        return numdept;
    }

    public void setNumdept(Integer numdept) {
        this.numdept = numdept;
    }

    public String getNombredept() {
        return nombredept;
    }

    public void setNombredept(String nombredept) {
        this.nombredept = nombredept;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
