package entities;

import javax.persistence.Entity;

@Entity
public class Virement extends Operation{

    private String beneficitaire;

    public Virement() {
    }

    public String getBeneficitaire() {
        return beneficitaire;
    }

    public void setBeneficitaire(String beneficitaire) {
        this.beneficitaire = beneficitaire;
    }
}
