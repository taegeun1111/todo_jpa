package com.example.todo.userapi.dto.response;

import com.example.todo.userapi.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@ToString @EqualsAndHashCode
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDTO {
    private String email;
    private String userName;

    @JsonFormat(pattern = "yyyy년 MM월 dd일")
    private LocalDate joinDate;

    private String token; //인증 토큰
    private String message;

    public LoginResponseDTO(User user, String token) {
        this.email = user.getEmail();
        this.userName = user.getUserName();
        this.joinDate = LocalDate.from(user.getJoinDate());
        this.token = token;
    }
}
