package com.back.jumptospring.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message="제목은 필수항목입니다.") // 해당값이 null임을 허용하지 않음
    @Size(max=200) // 최대 길이 200바이트로 제한
    private String subject;

    @NotEmpty(message="내용은 필수항목입니다.")
    private String content;
}
