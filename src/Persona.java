import java.util.ArrayList;
import java.util.List;

public class Persona {

    protected String nom;
    protected String ap;
    protected int edad;
    protected String doc;
    protected List<Perro> prrAdop;

    public Persona() {
    }

    public Persona(String nom, String ap, int edad, String doc) {
        this.nom = nom;
        this.ap = ap;
        this.edad = edad;
        this.doc = doc;
        this.prrAdop = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public List<Perro> getPrrAdop() {
        return prrAdop;
    }

    public void setPrrAdop(List<Perro> prrAdop) {
        this.prrAdop = prrAdop;
    }

    public boolean adopPrr(Perro perro) {
        if (prrAdop.size() < 3) {
            prrAdop.add(perro);
            return true;
        } else {
            return false;
        }
    }

    public Perro prrGnd() {
        if (prrAdop.isEmpty()) {
            return null;
        }

        Perro mayor = prrAdop.get(0);
        for (Perro p : prrAdop) {
            if (p.getEdad() > mayor.getEdad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    @Override
    public String toString() {
        String info = "Nombre: " + nom + " " + ap + ", Edad: " + edad + ", Documento: " + doc;
        info += "\nPerros adoptados:\n";
        if (prrAdop.isEmpty()) {
            info += "  Ninguno.";
        } else {
            for (Perro p : prrAdop) {
                info += "  - " + p + "\n";
            }
        }
        return info;
    }
}



