package com.example.projectdemo.services;

import com.example.projectdemo.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonService  {
    public List<Person> findAll();
    public Person getOne(String id);
    public void addPerson(Person person);
}
