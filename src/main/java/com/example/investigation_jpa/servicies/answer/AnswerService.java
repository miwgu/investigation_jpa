package com.example.investigation_jpa.servicies.answer;

import com.example.investigation_jpa.models.entity.Answer;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface AnswerService {

    Answer findById(long id);

    //Answer update(long id, Answer answer); // Do not need id

    Collection<Answer> findAllByPatientId(long patient_id);
    Collection <Answer> findAllByAnswerOptionId(long ao_id);

    List<Map<String, Object>> findBySurveyId(long survey_id);

    //    Collection <Answer> findBySurveyId(long survey_id);
    Collection<Answer> findAll();
    Answer add(long patient_id, long ao_id);

    Answer createAnswer(Answer answer);
    //Answer add(Answer answer);




    //List<Map<String, Object>> getBySurveyId(long surveyId);
}
