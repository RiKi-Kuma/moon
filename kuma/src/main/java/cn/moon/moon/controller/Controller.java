package cn.moon.moon.controller;

import cn.moon.moon.pojo.Question;
import cn.moon.moon.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
/*
    @Autowired
    private Service service;*/
    @Autowired
    private Question question;

    @RequestMapping("hello1")
    public String sayHello01(){
        return "sayHello1";
    }

   /* @RequestMapping("hello2")
    public String sayHello02(){
        return service.hello22();
    }*/

    @RequestMapping("question1")
    public Question userTest(){
        Question question = new Question();
        question.setAnswer("我是答案");
        question.setQuedtion("我是问题");
        question.setQuestionItem("我是问题主题");
        return question;
    }

    @RequestMapping(value="question2",produces="application/json; charset=utf-8")
    public Question questionTest(){
        return question;
    }
}
