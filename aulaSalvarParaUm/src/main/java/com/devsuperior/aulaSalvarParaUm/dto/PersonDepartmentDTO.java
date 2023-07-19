package com.devsuperior.aulaSalvarParaUm.dto;

public class PersonDepartmentDTO {

    private Long id;
    private String name;
    private Double Salary;

    private DepartmentDTO department;

    public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
        this.id = id;
        this.name = name;
        Salary = salary;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return Salary;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }
}
