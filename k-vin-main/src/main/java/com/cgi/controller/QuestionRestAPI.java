package com.cgi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cgi.model.Question;
import com.cgi.service.QuestionService;

@RestController
@RequestMapping("/admin")
public class QuestionRestAPI {

	@Autowired
	QuestionService qs;

	@PostMapping("/getall")
	public List<Question> allQuestions(){
		return qs.AllQuestions();
	}

	@GetMapping("/{id}")
	public Question get(@PathVariable String id) {
		return qs.findQuestionById(id);
	}

	@PostMapping("/add")
	@ResponseBody
	public Question addQuestion(@RequestBody Question q){
		return qs.saveQuestion(q);
	}
}
