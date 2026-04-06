package com.example.springboot_learn.repositories;
import com.example.springboot_learn.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository implements PersonDAO {

    private EntityManager entityManager;

    @Autowired
    // ฉีด (inject) object ให้อัตโนมัติ
    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    // ทำงานใน transaction ของ database
    public void save(Person person) {
        entityManager.persist(person);
    }

    @Override
    @Transactional
    // ทำงานใน transaction ของ database
    public void delete(Integer id) {
        Person person = entityManager.find(Person.class, id);
        if (person != null) {
            entityManager.remove(person);
        }
    }

}
