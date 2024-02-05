package com.course.platform.resources.exceptions;

import com.course.platform.services.exceptions.DataBaseException;
import com.course.platform.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity <StandardError> entityNotFound(ResourceNotFoundException exception, HttpServletRequest request){
      HttpStatus status = HttpStatus.NOT_FOUND;
      StandardError error = new StandardError();
      error.setTimestamp(Instant.now());
      error.setStatus(status.value());
      error.setError("Resource not Found");
      error.setMessage(error.getMessage());
      error.setPath(request.getRequestURI());
      return new ResponseEntity<StandardError>(error , HttpStatus.NOT_FOUND);
  }

    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity <StandardError> database(DataBaseException exception, HttpServletRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError error = new StandardError();
        error.setTimestamp(Instant.now());
        error.setStatus(status.value());
        error.setError("Database Exception");
        error.setMessage(error.getMessage());
        error.setPath(request.getRequestURI());
        return new ResponseEntity<StandardError>(error , HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity <ValidationError> notValidArgument (MethodArgumentNotValidException exception, HttpServletRequest request){
        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
        ValidationError error = new ValidationError();
        error.setTimestamp(Instant.now());
        error.setStatus(status.value());
        error.setError("Not Valid Argument");
        error.setMessage(error.getMessage());
        error.setPath(request.getRequestURI());
        for(FieldError err : exception.getBindingResult().getFieldErrors()){
             error.addError(err.getField(), err.getDefaultMessage());
        }
        return new ResponseEntity<ValidationError>(error , HttpStatus.UNPROCESSABLE_ENTITY);
    }

}
