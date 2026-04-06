package com.example.springboot_learn.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "person")
// This table will be called "person"
public class Person {
    @Id
    // This value is unique
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // This value will be generated automatically and incrementally
    @Column(name = "id")
    // This value will be called "id"
    private int id;

    @Column(name = "firstname")
    // This value will be called "firstname"
    private String fname;

    @Column(name = "lastname")
    // This value will be called "lastname"
    private String lname;

    // Default Constructor
    public Person() {

    }

    // Parameter Constructor
    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
