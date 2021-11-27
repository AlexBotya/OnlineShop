package ru.gb.onlineShop.repository;

import org.hibernate.cfg.Configuration;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.gb.onlineShop.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Optional;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    public default Optional<User> findByEmail(String email){
        EntityManagerFactory factory = new Configuration().configure()
                .buildSessionFactory();
        EntityManager entityManager = factory.createEntityManager();
        return Optional.of(entityManager.find(User.class, email));
        }
    }

