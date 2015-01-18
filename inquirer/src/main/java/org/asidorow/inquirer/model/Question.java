package org.asidorow.inquirer.model;

import java.io.Serializable;

public class Question implements Serializable {
    private static final long serialVersionUID = 2100289913739960855L;
    private int questionId;
    private String questionText;

    public Question(int questionId, String questionText) {
        this.questionId = questionId;
        this.questionText = questionText;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionText() {
        return questionText;
    }
}
