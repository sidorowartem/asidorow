package org.asidorow.inquirer.web.controller;

import org.asidorow.inquirer.model.Question;
import org.asidorow.inquirer.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionsService service;

    @RequestMapping(value = "/getRandomQuestion.data")
    @ResponseBody
    public Question getRandomQuestion() {
        return service.getRandomQuestion();
    }

    @RequestMapping(value = "/getAllQuestions.data")
    @ResponseBody
    public List<Question> getAllQuestions() {
        return service.getAllQuestions();
    }
}
