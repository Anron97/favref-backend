package com.bsuir.favref.model.dto.registration;


import com.bsuir.favref.model.dto.ErrorInfoDto;

/**
 * @author a.shakarov
 * @version 1.0
 */
public class RegistrationErrorInfoDto extends ErrorInfoDto {

    public final String error;

    public RegistrationErrorInfoDto(String requestUrl, Exception exception, RegistrationResponseStatus errorStatus) {
        super(requestUrl, exception);
        this.error = errorStatus.name();
    }
}
