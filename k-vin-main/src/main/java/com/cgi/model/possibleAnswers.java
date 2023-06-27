package com.cgi.model;

import lombok.Data;
@Data

public class possibleAnswers {
	private Object answer;
	
	public Object getAnswer() {
		return answer;
	}
	public void setAnswer(Object answer) {
		this.answer = answer;
	}
}
