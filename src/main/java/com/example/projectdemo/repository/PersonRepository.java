package com.example.projectdemo.repository;

import com.example.projectdemo.model.Person;

import java.util.List;

public interface PersonRepository {
    public List<Person> findAll();
    public Person getOne(String id);
    public void addPerson(Person person);
}
