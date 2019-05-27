package com.bsuir.favref.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author a.shakarov
 * @version 1.0
 */
@Getter
@Setter
@EqualsAndHashCode
@Component
public class TagDto {
    private String value;
}
