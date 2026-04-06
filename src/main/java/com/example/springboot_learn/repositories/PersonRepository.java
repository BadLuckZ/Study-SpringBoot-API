package com.example.springboot_learn.repositories;
import com.example.springboot_learn.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public Person get(Integer id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public List<Person> getAll() {
        TypedQuery<Person> query = entityManager.createQuery("FROM Person", Person.class);
        return query.getResultList();
    }


}
