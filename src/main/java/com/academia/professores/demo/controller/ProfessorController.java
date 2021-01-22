package com.academia.professores.demo.controller;

import com.academia.professores.demo.entity.Professor;
import com.academia.professores.demo.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService service;

    @GetMapping("/busca")
    public List<Professor> get() {
        return service.get();
    }

    @GetMapping
    public String get2() {
        return "Parabéns chegou!";
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public String criarProf(@RequestBody Professor prof) {
        return service.create(prof);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

}
