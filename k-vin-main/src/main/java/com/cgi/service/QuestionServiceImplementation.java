package com.cgi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cgi.model.Question;
import com.cgi.repository.QuestionRepository;

public class QuestionServiceImplementation implements QuestionService{

	@Autowired
	QuestionRepository Qr;


	@Override
	public Question saveQuestion(Question qs) {
		Qr.save(qs);
		return qs;
	}

	@Override
	public Question findQuestionById(String id) {
		return Qr.findById(id).get();
	}

	@Override
	public void deleteQuestion(String id) {
		Qr.deleteById(id);
	}

	@Override
	public Question updateQuestion(String id, Question q) {
		Question qt = this.findQuestionById(id);
		qt.setPossibleanswers(q.getPossibleanswers());
		qt.setDifficultyIndex(q.getDifficultyIndex());
		qt.setDuration(q.getDuration());
		qt.setType(q.getType());
		qt.setquestionStatement(q.getquestionStatement());
		return Qr.save(qt);

	}

	@Override
	public List<Question> AllQuestions() {
		return Qr.findAll();
	}

}
