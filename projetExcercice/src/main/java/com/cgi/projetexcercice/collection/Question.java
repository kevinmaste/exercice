package com.cgi.projetexcercice.collection;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Builder
@Document(collection = "data")
public class Question {
    public List<possibleAnswers> getPossibleanswers() {
        return possibleanswers;
    }

    public void setPossibleanswers(List<possibleAnswers> possibleanswers) {
        this.possibleanswers = possibleanswers;
    }

    public List<correctAnswers> getCorrectanswers() {
        return correctanswers;
    }

    public void setCorrectanswers(List<correctAnswers> correctanswers) {
        this.correctanswers = correctanswers;
    }

    public String getId() {
        return id;
    }

    public Object getQuestionStatement() {
        return questionStatement;
    }

    public void setQuestionStatement(Object questionStatement) {
        this.questionStatement = questionStatement;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getDifficultyIndex() {
        return difficultyIndex;
    }

    public void setDifficultyIndex(int difficultyIndex) {
        this.difficultyIndex = difficultyIndex;
    }

    @Id
    private String id;
    private Object questionStatement;
    private Long duration;
    private String type;
    private List<possibleAnswers> possibleanswers;
    private List<correctAnswers> correctanswers;
    private int difficultyIndex;
}
