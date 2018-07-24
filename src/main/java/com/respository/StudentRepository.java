package com.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.model.Student;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long> {

}
