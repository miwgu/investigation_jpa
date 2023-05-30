package com.example.investigation_jpa.models.dto;

import com.example.investigation_jpa.models.entity.Question;

public interface QuestionMapper {
    QuestionDTO toQuestionDTO(Question question);
    Question toQuestion(QuestionDTO dto);
}
