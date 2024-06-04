package lorenzofoschetti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lorenzofoschetti.dao.EventiDAO;
import lorenzofoschetti.entities.Evento;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d12");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventiDAO ed = new EventiDAO(em);
        Evento evento = new Evento("");

        em.close();
        emf.close();
    }
}
