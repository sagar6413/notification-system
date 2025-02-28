package com.notificationsystem.common_library.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException{
    public BadRequestException(String message){
        super(message, HttpStatus.BAD_REQUEST, "BAD_REQUEST");
    }
}