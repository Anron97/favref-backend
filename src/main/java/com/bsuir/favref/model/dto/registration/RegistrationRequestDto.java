package com.bsuir.favref.model.dto.registration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author a.shakarov
 * @version 1.0
 */
@Getter
@Setter
@Component
public class RegistrationRequestDto {
    private String username;
    private String password;
    private String image;
}
