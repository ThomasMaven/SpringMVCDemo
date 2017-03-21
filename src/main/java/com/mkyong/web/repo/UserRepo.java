package com.mkyong.web.repo;

import com.mkyong.web.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by ttomaka on 21.03.2017.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class UserRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public User findByPrimaryKey(int id) {
        User user = entityManager.find(User.class, id);
        return user;
    }
}
