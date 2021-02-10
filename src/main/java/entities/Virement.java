package entities;

import javax.persistence.Entity;

@Entity
public class Virement extends Operation{
    //TODO
    private String beneficitaire;

    public Virement() {
    }
}
