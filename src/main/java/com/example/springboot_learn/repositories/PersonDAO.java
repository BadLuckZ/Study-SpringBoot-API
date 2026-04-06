package com.example.springboot_learn.repositories;

import com.example.springboot_learn.entities.Person;

import java.util.List;

public interface PersonDAO {
    // บันทึกข้อมูลลงใน Table Person
    void save(Person person);

    // ลบข้อมูลออกจาก Table Person
    void delete(Integer id);

    // ดึงข้อมูล 1 คนจาก Table Person
    Person get(Integer id);

    // ดึงข้อมูลทั้งหมดจาก Table Person
    List<Person> getAll();
}
