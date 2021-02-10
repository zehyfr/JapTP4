package entities;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class AssuranceVie extends Compte{
    //TODO
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    private double taux;

    public AssuranceVie() {
    }
}
