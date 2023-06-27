package com.cgi.projetexcercice.service;

import com.cgi.projetexcercice.collection.Question;

import java.util.List;

public interface QuestionService {
    List<Question> AllQuestions();
    Question saveQuestion(Question qs);
    Question findQuestionById(String id);
    void deleteQuestion(String id);
    Question updateQuestion(String id, Question question);
}
