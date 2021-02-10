package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Adresse implements Serializable {

    private int numero;
    private String rue;
    private int codePostal;
    private String ville;

    public Adresse(){

    }

    public Adresse(int numero, String rue, int codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", rue='" + rue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
