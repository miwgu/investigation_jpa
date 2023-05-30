package com.example.investigation_jpa.models.dto;

import com.example.investigation_jpa.models.entity.Patient;

public interface PatientMapper {
    PatientDTO toPatientDTO(Patient patient);
    Patient toPatient(PatientDTO dto);
}
