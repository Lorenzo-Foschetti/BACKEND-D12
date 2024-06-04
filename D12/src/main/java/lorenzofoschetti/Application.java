package lorenzofoschetti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lorenzofoschetti.dao.EventiDAO;
import lorenzofoschetti.entities.Evento;
import lorenzofoschetti.entities.TipoEvento;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d12");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventiDAO ed = new EventiDAO(em);
        Evento evento = new Evento("ciao", LocalDate.of(2024, 06, 02), "Bellssima festa", TipoEvento.PUBBLICO, 40);
        Evento secondoEvento = new Evento("Festa di compleanno", LocalDate.of(2024, 06, 10), "Orrenda", TipoEvento.PRIVATO, 60);
        //primo metodo
        //ed.salvaEvento(evento);
        //ed.salvaEvento(secondoEvento);

        //secondo metodo
        //Evento myEvent = ed.cercaPerId(1);
        //System.out.println(myEvent);


        //terzo metodo
        //ed.cercaElimina(52);
        em.close();
        emf.close();
    }
}
