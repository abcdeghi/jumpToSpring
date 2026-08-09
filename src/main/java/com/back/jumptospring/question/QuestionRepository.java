package com.back.jumptospring.question;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Question 엔터티로 Repository를 만들겠다. 기본키 Integer
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);
}
