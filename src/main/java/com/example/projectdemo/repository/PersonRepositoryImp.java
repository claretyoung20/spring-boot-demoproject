package com.example.projectdemo.repository;

import com.example.projectdemo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepositoryImp implements PersonRepository {

    List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("1","Young", "016068676"),
            new Person("2","Nnenna", "012406876"),
            new Person("3","MaryClaret", "076858636")
    ));

    @Override
    public List<Person> findAll() {
        return persons;
    }

    @Override
    public Person getOne(String id) {

        Person person = null;
        for(int i=0; i<persons.size(); i++){
            if(persons.get(i).getId().equals(id)){
                person =  persons.get(i);
            }
        }
        return person;
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }
    
}
