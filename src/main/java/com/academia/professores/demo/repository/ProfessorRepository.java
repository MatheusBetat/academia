package com.academia.professores.demo.repository;

import com.academia.professores.demo.entity.Professor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProfessorRepository extends MongoRepository<Professor, Long> {

    List<Professor> findAll();
}
