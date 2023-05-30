package com.example.investigation_jpa.models.dto;

import com.example.investigation_jpa.models.entity.AnswerOption;

public interface AnswerOptionMapper {
    AnswerOptionDTO toAnswerOptionDTO(AnswerOption answerOption);
    AnswerOption toAnswerOption(AnswerOptionDTO dto);
}
