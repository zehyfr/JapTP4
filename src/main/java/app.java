import entities.*;
import net.bytebuddy.implementation.bytecode.Addition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app {
    public static void main(String[] args) {
        // Test var
        Adresse ad1 = new Adresse();
        Adresse ad2 = new Adresse();

        AssuranceVie av1 = new AssuranceVie();
        AssuranceVie av2 = new AssuranceVie();

        Banque b1 = new Banque();
        Banque b2 = new Banque();

        Client cl1 = new Client();
        Client cl2 = new Client();

        Compte co1 = new Compte();
        Compte co2 = new Compte();

        LivretA l1 = new LivretA();
        LivretA l2 = new LivretA();

        Operation o1 = new Operation();
        Operation o2 = new Operation();

        Virement v1 = new Virement();
        Virement v2 = new Virement();

        // Openning db connection

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-b3");
        EntityManager em = emf.createEntityManager();

        // Closing connection
        em.close();
    }
}
