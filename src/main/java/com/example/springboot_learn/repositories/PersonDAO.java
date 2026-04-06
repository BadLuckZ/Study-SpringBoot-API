package com.example.springboot_learn.repositories;

import com.example.springboot_learn.entities.Person;

public interface PersonDAO {
    // บันทึกข้อมูลลงใน Table Person
    void save(Person person);

    // ลบข้อมูลออกจาก Table Person
    void delete(Integer id);
}
