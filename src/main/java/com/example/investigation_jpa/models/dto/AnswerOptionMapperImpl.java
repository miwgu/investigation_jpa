package com.example.investigation_jpa.models.dto;

import com.example.investigation_jpa.exception.ResourceNotFoundException;
import com.example.investigation_jpa.models.entity.AnswerOption;
import com.example.investigation_jpa.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnswerOptionMapperImpl implements AnswerOptionMapper {
    private final QuestionRepository questionRepository;

    @Override
    public AnswerOptionDTO toAnswerOptionDTO(AnswerOption answerOption) {
        AnswerOptionDTO dto = new AnswerOptionDTO();
        dto.setId(answerOption.getId());
        dto.setItem(answerOption.getItem());
        if (answerOption.getQuestion() != null) {
            dto.setQuestion(answerOption.getQuestion().getId());
        }

        return dto;
    }

    @Override
    public AnswerOption toAnswerOption(AnswerOptionDTO dto) {
        AnswerOption answerOption = new AnswerOption();
        answerOption.setId(dto.getId());
        answerOption.setItem(dto.getItem());
        if (dto.getQuestion() != 0) {
            answerOption.setQuestion(questionRepository.findById(dto.getQuestion())
                    .orElseThrow(() -> new ResourceNotFoundException("Question not found for this id :: " + dto.getQuestion())));
        }

        return answerOption;
    }
}
