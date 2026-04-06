package com.example.springboot_learn.controllers;

import com.example.springboot_learn.entities.Person;
import com.example.springboot_learn.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

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
    //      firstname: "",
    //      lastname: ""
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
}
