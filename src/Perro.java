public class Perro {

    protected String plc;
    protected String nomp;
    protected String raza;
    protected int edad;
    protected String tam;

    public Perro() {
    }

    public Perro(String plc, String nomp, String raza, int edad, String tam) {
        this.plc = plc;
        this.nomp = nomp;
        this.raza = raza;
        this.edad = edad;
        this.tam = tam;
    }

    public String getPlc() {
        return plc;
    }

    public void setPlc(String plc) {
        this.plc = plc;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "placa='" + plc + '\'' +
                ", nombre='" + nomp + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamaño='" + tam + '\'' +
                '}';
    }
}

