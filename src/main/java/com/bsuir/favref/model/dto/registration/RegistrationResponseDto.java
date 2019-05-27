package com.bsuir.favref.model.dto.registration;

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
public class RegistrationResponseDto {
    private String status;

    public RegistrationResponseDto(RegistrationResponseStatus status) {
        this.status = status.name();
    }
}
