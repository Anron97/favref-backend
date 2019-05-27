package com.bsuir.favref.model.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author a.shakarov
 * @version 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class LoginResponseDto {
    private String token;
    private Long id;
    private String username;
    private String image;

    public LoginResponseDto(String token, AuthUserDto authUserDto) {
        this.token = token;
        this.id = authUserDto.getId();
        this.username = authUserDto.getUsername();
        this.image = authUserDto.getImage();
    }
}
