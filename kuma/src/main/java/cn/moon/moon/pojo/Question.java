package cn.moon.moon.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Question {
    @Value("${id}")
    private Integer id;
    @Value("${question}")
    private String question;
    private Integer questionID;
    @Value("${answer}")
    private String answer;
    @Value("${questionItem}")
    private String questionItem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuedtion() {
        return question;
    }

    public void setQuedtion(String quedtion) {
        this.question = quedtion;
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionItem() {
        return questionItem;
    }

    public void setQuestionItem(String questionItem) {
        this.questionItem = questionItem;
    }




}
