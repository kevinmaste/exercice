package com.cgi.projetexcercice.controller;

import com.cgi.projetexcercice.collection.Question;
import com.cgi.projetexcercice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class QuestionController {

    @Autowired
    private QuestionService qs;

    @GetMapping
    public List<Question> allQuestions(){
        return qs.AllQuestions();
    }

    @PostMapping("/add")
    public Question add(@RequestBody Question question){
        return qs.saveQuestion(question);

    }
}
