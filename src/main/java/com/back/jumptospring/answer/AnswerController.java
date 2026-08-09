package com.back.jumptospring.answer;

import com.back.jumptospring.question.Question;
import com.back.jumptospring.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@Controller
@RequiredArgsConstructor
public class AnswerController {

    private final QuestionService questionService;

    @PostMapping("/create/{id}") // post 요청을 처리하는 경우에 사용
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam(value="content") String content) {
        Question question = this.questionService.getQuestion(id);
        // TODO: 답변을 저장한다.
        return String.format("redirect:/question/detail/%s", id);
    }
}
