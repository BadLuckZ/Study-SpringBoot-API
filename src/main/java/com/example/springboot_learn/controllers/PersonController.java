package com.example.springboot_learn.controllers;

import com.example.springboot_learn.entities.Person;
import com.example.springboot_learn.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// mark this class as a request handler
@RequestMapping("/persons")
// '/persons' group
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // POST /persons
    // Body: {
    //      fname: "",
    //      lname: ""
    // }
    @PostMapping
    public String createPerson(@RequestBody Person person) {
        personRepository.save(person);
        return "Person saved!";
    }

    // DELETE /persons/{id}
    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable Integer id) {
        personRepository.delete(id);
        return "Person " +  id + " deleted!";
    }

    // PUT /persons/{id}
    @PutMapping("/{id}")
    public String updatePerson(@PathVariable Integer id, @RequestBody Person person) {
        Person existingPerson = personRepository.get(id);
        if (existingPerson == null) {
            return "Person not found!";
        }
        personRepository.update(id, person);
        return "Person " + id + " updated!";
    }

    // GET /persons
    @GetMapping
    public List<Person> getAllPerson() {
        return personRepository.getAll();
    }

    // GET /persons/{id}
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Integer id) {
        return personRepository.get(id);
    }
}
