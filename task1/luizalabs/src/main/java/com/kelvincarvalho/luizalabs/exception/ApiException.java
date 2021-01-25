package com.kelvincarvalho.luizalabs.exception;

import java.io.Serializable;

public class ApiException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -7387221754988743838L;

    private String message;

    public ApiException(String msg) {
        super(msg);
        message = msg;
    }

    public String getMessage()

    {
        return message;
    }

}
