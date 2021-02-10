package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="COMPTE")
public class Compte {
    @Id
    private String numero;

    private double solde;

    @ManyToMany
    private Set<Client> clients;

    @OneToMany(mappedBy = "compte")
    private Set<Operation> operations;


    public Compte(){
        this.operations = new HashSet<Operation>();
    }
}
