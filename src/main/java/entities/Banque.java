package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="BANQUE")
public class Banque {
    @Id
    private String nom;

    @OneToMany(mappedBy="banque")
    private Set<Client> clients;

    public Banque(){
        this.clients = new HashSet<Client>();
    }
}
