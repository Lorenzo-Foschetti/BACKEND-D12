package lorenzofoschetti.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lorenzofoschetti.entities.Evento;

public class EventiDAO {


    private final EntityManager em;

    public EventiDAO(EntityManager em) {
        this.em = em;
    }

    //primo metodo
    public void salvaEvento(Evento evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();
        
        System.out.println("Il tuo evento " + evento.getTitolo() + " è stato salvato nel Database!");
    }


    //secondo metodo


    //terzometodo
}
