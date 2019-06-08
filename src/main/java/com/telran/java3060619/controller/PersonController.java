package com.telran.java3060619.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @GetMapping("/person")
    public PersonDto getPerson(){
        PersonDto res = new PersonDto();
        res.name = "Petya";
        res.age = 23;
        return res;
    }

    @PostMapping("/person")
    public void addPerson(@RequestBody PersonDto person){
        System.out.println(person.name + " " + person.age);
    }


}
