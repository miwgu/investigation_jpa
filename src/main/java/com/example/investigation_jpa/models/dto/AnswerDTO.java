package com.example.investigation_jpa.models.dto;

import lombok.Data;

@Data
public class AnswerDTO {
    private long id;
    private long patient;
    private long answerOption;
}
