package com.teamj.book.repository;

import com.teamj.book.domain.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    @PersistenceContext
    private final EntityManager em;
    public void save(User user){
        em.persist(user);
    }
    public User findUser(int userId){
        return em.find(User.class, userId);
    }
}
