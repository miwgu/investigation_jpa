package com.example.investigation_jpa.models.dto;

import lombok.Data;

import java.util.List;
import java.util.Set;
@Data
public class PatientDTO {

    private  long id;
    private String socialNumber;
    private String fullName;
    private String email;
    private String password;
    private Set<String> roles;
    private List<Long> answers;

}
