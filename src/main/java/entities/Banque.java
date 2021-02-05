package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BANQUE")
public class Banque {
    @Id
    private String nom;

    public Banque(){

    }
}
