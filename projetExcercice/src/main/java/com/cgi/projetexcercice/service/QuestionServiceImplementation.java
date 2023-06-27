package com.cgi.projetexcercice.service;

import com.cgi.projetexcercice.collection.Question;
import com.cgi.projetexcercice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplementation implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public List<Question> AllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question saveQuestion(Question qs) {
        return questionRepository.save(qs);
    }

    @Override
    public Question findQuestionById(String id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public void deleteQuestion(String id) {
        questionRepository.deleteById(id);
    }

    @Override
    public Question updateQuestion(String id, Question question) {
        Question qt = this.findQuestionById(id);
        qt.setPossibleanswers(question.getPossibleanswers());
        qt.setDifficultyIndex(question.getDifficultyIndex());
        qt.setDuration(question.getDuration());
        qt.setType(question.getType());
        qt.setQuestionStatement(question.getQuestionStatement());
        return questionRepository.save(qt);
    }
}
