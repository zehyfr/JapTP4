package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="OPERATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
    @Id
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private double montant;
    private String motif;
    
    @ManyToOne
    private Compte compte;

    public Operation(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
