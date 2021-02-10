package entities;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="CLIENT")
public class Client {
    @Id
    private int id;
    private String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Embedded
    private Adresse adresse;

    @ManyToOne
    private Banque banque;

    @ManyToMany
    private Set<Compte> comptes;

    public Client(){
        this.comptes = new HashSet<Compte>();
    }
}
