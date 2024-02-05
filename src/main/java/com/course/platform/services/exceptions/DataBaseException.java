package com.course.platform.services.exceptions;

import java.io.Serial;
import java.io.Serializable;

public class DataBaseException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DataBaseException(String msg){
        super(msg);
    }



}
