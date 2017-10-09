package com.example.projectdemo.services;


import com.example.projectdemo.model.Person;
import com.example.projectdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;

@Service
public class PersonServiceImp implements PersonService{
    @Autowired
    private PersonRepository customerRepository;

    @Autowired
    public void setCustomerRepository(PersonRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public PersonRepository getCustomerRepository() {
        return customerRepository;
    }

    @Override
    public List<Person> findAll() {
      return customerRepository.findAll();
    }

    @Override
    public Person getOne(String id) {
        return customerRepository.getOne(id);
    }

    @Override
    public void addPerson(Person person) {
        customerRepository.addPerson(person);
    }


}
