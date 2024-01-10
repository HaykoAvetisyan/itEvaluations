package com.example.itevaluations.exception;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class ExceptionConstants {

    public final MessageSource messageSource;

    public ExceptionConstants(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getUserAlreadyExistMessage(){
        return messageSource.getMessage("error.user.not.found",null, Locale.ENGLISH);
    }


}
