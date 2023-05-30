package com.example.investigation_jpa.models.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    private Patient patient;


    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="answer_op_id",referencedColumnName = "id")
    private AnswerOption answerOption;

}
