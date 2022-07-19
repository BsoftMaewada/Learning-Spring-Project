package com.bsoft.learningspringproject.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


//To handle exception globally use controller exception
@ControllerAdvice
public class ProductNotfoundException extends RuntimeException{
    @ExceptionHandler(value = ProductNotfoundException.class)
    public ResponseEntity<Object> exception(ProductNotfoundException exception){
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }


}
