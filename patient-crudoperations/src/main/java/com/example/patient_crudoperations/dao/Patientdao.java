package com.example.patient_crudoperations.dao;

import com.example.patient_crudoperations.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="patients")
public  interface Patientdao extends JpaRepository<Patient,Integer> {

}
