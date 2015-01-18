package org.asidorow.inquirer.repository;

import org.asidorow.inquirer.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${repo.question.query_all_questions}")
    private String SQL_QUERY_ALL_QUESTIONS;

    public List<Question> getAllQuestions() {
        return jdbcTemplate.query(SQL_QUERY_ALL_QUESTIONS,
                (rs, r) -> new Question(rs.getInt(1), rs.getString(2)));
    }
}
