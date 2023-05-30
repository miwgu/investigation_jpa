package com.example.investigation_jpa.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long num;
    private String text;

    @ManyToOne
    @JoinTable(name = "question_survey",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "survey_id"))
    private Survey survey;

    @OneToMany(mappedBy = "question")
    private List<AnswerOption> answerOptions;

}