package com.cgi.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection="Question")

public class Question {
	@Id
	private String id;
	private Object questionStatement;
	private Long duration;
	private String type;
	private List<possibleAnswers> possibleanswers;
	private List<correctAnswers> correctanswers;
	private int difficultyIndex;
	public int getDifficultyIndex() {
		return difficultyIndex;
	}
	public void setDifficultyIndex(int difficultyIndex) {
		this.difficultyIndex = difficultyIndex;
	}
	public Object getquestionStatement() {
		return questionStatement;
	}
	public void setquestionStatement(Object questionStatement) {
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
	public String getId() {
		return id;
	}


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




}
