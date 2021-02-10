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
}
