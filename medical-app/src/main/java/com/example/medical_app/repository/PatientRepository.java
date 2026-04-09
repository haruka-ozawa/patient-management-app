package com.example.medical_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.medical_app.model.Patient;

public interface PatientRepository extends JpaRepository <Patient, Long>{
}