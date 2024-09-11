package com.korit.senicare.dto.request.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 아이디 중복 확인 Request Body DTO

@Getter
@Setter
@NoArgsConstructor
public class IdCheckRequestDto {
    
    @NotBlank   // 문자열의 필수값
    private String userId;
}
