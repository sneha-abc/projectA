package com.Exception;

public class NotEligibleforExam extends RuntimeException
{
    public NotEligibleforExam()
    {

    }
    public NotEligibleforExam(String message)
    {
        super(message);
    }

}
