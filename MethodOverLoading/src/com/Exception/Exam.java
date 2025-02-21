package com.Exception;

public class Exam {

        int marks;
        public Exam(int marks)
        {
            this.marks=marks;
        }

        public int getMarks() {
            return marks;
        }
        public static void main(String[] args)
        {
            Exam exam=new Exam(20);
            if(exam.getMarks()>35)
            {
                System.out.println("eligible for Exam");
            }
            else {
                throw new NotEligibleforExam("not eligible for Exam because marks is less than 35");//we are sending message to exception class
            }
        }
    }


