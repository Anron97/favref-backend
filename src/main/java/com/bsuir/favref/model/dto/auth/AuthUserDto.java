package com.bsuir.favref.model.dto.auth;

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
@Component
public class AuthUserDto {
    private Long id;
    private String username;
    private String image;

    public AuthUserDto(Long id, String username, String image) {
        this.id = id;
        this.username = username;
        this.image = image;
    }
}
