package com.academia.professores.demo.service;


import com.academia.professores.demo.entity.Professor;
import com.academia.professores.demo.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository repository;
    private final SequenceGeneratorService serviceId;

    public List<Professor> get() {
        return repository.findAll();
    }

    public String create(Professor professor) {
        professor.setId(serviceId.generateSequence(Professor.SEQUENCE_NAME));
        repository.save(professor);
        return "Registro criado com sucesso.";
    }



    public void delete(String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
