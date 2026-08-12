package com.back.jumptospring.answer;

import com.back.jumptospring.question.Question;
import com.back.jumptospring.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne //외래키 관계 생성
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;
}
