package com.devsuperior.aulaSalvarParaUm.services;

import com.devsuperior.aulaSalvarParaUm.dto.PersonDepartmentDTO;
import com.devsuperior.aulaSalvarParaUm.entities.Department;
import com.devsuperior.aulaSalvarParaUm.entities.Person;
import com.devsuperior.aulaSalvarParaUm.repositories.DepartmentRepository;
import com.devsuperior.aulaSalvarParaUm.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;
    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());
        
        //retorna toda entidade no json
        Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

        //retorna apenas o Id no json
        //Department dept = new Department();
        //dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);
        return new PersonDepartmentDTO(entity);
    }
}
