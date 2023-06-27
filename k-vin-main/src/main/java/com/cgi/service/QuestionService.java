package com.cgi.service;

import java.util.List;

import com.cgi.model.Question;

public interface QuestionService {
	
	List<Question> AllQuestions();
	Question saveQuestion(Question qs);
	Question findQuestionById(String id);
	void deleteQuestion(String id);
	Question updateQuestion(String id, Question question);
	
}
