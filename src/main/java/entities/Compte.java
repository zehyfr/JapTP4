package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPTE")
public class Compte {
    @Id
    private String numero;

    @Column(name="solde")
    private double solde;

    public Compte(){

    }
}
