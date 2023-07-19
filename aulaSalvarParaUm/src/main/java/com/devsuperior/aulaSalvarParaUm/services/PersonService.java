package com.devsuperior.aulaSalvarParaUm.services;

import com.devsuperior.aulaSalvarParaUm.dto.PersonDepartmentDTO;
import com.devsuperior.aulaSalvarParaUm.entities.Person;
import com.devsuperior.aulaSalvarParaUm.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {

        Person person = new Person();
    }
}
