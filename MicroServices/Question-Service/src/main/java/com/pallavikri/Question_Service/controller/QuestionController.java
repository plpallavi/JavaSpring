package com.pallavikri.Question_Service.controller;

import com.pallavikri.Question_Service.model.Question;
import com.pallavikri.Question_Service.model.QuestionWrapper;
import com.pallavikri.Question_Service.model.Response;
import com.pallavikri.Question_Service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions){
        return questionService.getQuestionsForQuiz(categoryName, numQuestions);
    }

    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionsIds){
        return questionService.getQuestionsFromId(questionsIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List <Response> responses){
        return questionService.getScore(responses);
    }

}

