package com.Exception;

public class PinCodeNotCorrect extends RuntimeException{
    public PinCodeNotCorrect()
    {

    }
    public PinCodeNotCorrect(String message)
    {
        super(message);
    }
}
