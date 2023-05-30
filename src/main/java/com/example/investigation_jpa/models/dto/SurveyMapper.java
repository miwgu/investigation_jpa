package com.example.investigation_jpa.models.dto;

import com.example.investigation_jpa.models.entity.Survey;

public interface SurveyMapper {

    SurveyDTO toSurveyDto(Survey survey);
    Survey toSurvey(SurveyDTO surveyDto);
}
