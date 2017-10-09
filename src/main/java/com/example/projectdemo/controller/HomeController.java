package com.example.projectdemo.controller;
import com.example.projectdemo.model.Person;
import com.example.projectdemo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class HomeController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "person", method = RequestMethod.GET)
    public List<Person> getAll(){
        return personService.findAll();
    }

    @RequestMapping(value = "person/{id}", method = RequestMethod.GET)
    public Person getOne(@PathVariable String id){
        return personService.getOne(id);
    }

    @RequestMapping(value = "person", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){

         personService.addPerson(person);
    }
}
