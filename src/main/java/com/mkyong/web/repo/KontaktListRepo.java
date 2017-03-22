package com.mkyong.web.repo;

import com.mkyong.web.model.KontaktList;
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
public class KontaktListRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public List<KontaktList> getAllContacts() {
        TypedQuery<KontaktList> query = entityManager.createQuery("Select kl from KontaktList kl", KontaktList.class);
        return query.getResultList();
    }

    public String getAllContactsAsString() {
        TypedQuery<KontaktList> query = entityManager.createQuery("Select kl from KontaktList kl", KontaktList.class);
        List<KontaktList> kontaktLists = query.getResultList();
        String returnString = "";
        for(KontaktList list : kontaktLists) {
            returnString += list.toString();
        }
        return returnString;
    }


    public void saveKontaktList(KontaktList kontaktList) {
        entityManager.merge(kontaktList);
    }
}
