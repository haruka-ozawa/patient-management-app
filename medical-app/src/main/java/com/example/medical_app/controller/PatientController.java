package com.example.medical_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.medical_app.model.Patient;
import com.example.medical_app.repository.PatientRepository;


@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @GetMapping("/patients")
    public List<Patient> getAll() {
        return repository.findAll();
    }

    @PostMapping("/patients")
    public Patient add(@RequestBody Patient p) {
        return repository.save(p);
    }

    @DeleteMapping("/patients/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
