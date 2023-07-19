package com.devsuperior.aulaSalvarParaUm.repositories;

import com.devsuperior.aulaSalvarParaUm.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
