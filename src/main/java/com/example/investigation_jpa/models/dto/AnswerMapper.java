package com.example.investigation_jpa.models.dto;

import com.example.investigation_jpa.models.entity.Answer;

public interface AnswerMapper {
    AnswerDTO toAnswerDto(Answer answer);
    Answer toAnswer(AnswerDTO dto);
}
