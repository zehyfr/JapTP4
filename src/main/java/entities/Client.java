package entities;

import javax.persistence.*;
import java.util.Date;

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

    public Client(){

    }
}
