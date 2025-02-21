package com.Exception;

public class NoCreditCardPaymentException extends RuntimeException{
    public NoCreditCardPaymentException(String message){
        super(message);
    }
}
