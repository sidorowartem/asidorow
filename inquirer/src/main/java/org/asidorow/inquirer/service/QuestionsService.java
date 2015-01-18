package org.asidorow.inquirer.service;

import org.asidorow.inquirer.model.Question;
import org.asidorow.inquirer.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestionsService {

    @Autowired
    private QuestionRepository repository;

    public List<Question> getAllQuestions() {
        return repository.getAllQuestions();
    }

    public Question getRandomQuestion() {
        List<Question> questions = repository.getAllQuestions();
        Random random = new Random();
        int randomIndex = random.nextInt(questions.size());
        return questions.get(randomIndex);
    }

}
