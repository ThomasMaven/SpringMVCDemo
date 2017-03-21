package com.mkyong.web.repo;

import com.mkyong.web.model.Kontakt;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by ttomaka on 21.03.2017.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class KontaktRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Kontakt kontakt) {
        entityManager.persist(kontakt);
    }

    public Kontakt findByPrimaryKey(int id) {
        Kontakt kontakt = entityManager.find(Kontakt.class, id);
        return kontakt;
    }

    public List<Kontakt> getAllContacts() {
        TypedQuery<Kontakt> query = entityManager.createQuery("Select k from Kontakt k", Kontakt.class);
        return query.getResultList();
    }

    public String getAllContactsAsString() {
        String returnString = "";
        List<Kontakt> kontaktList = getAllContacts();
        for(Kontakt kontakt : kontaktList) {
            returnString += kontakt.getTypeId() + ": ";
            returnString += kontakt.getValue() + "\n<br>";
        }
        return returnString;
    }
}
