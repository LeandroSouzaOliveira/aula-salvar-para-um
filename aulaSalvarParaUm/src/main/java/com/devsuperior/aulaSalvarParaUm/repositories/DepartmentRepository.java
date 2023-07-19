package com.devsuperior.aulaSalvarParaUm.repositories;

import com.devsuperior.aulaSalvarParaUm.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
