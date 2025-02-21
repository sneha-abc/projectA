package com.Exception;

public class OnlineTranscition extends Bank{
    String paymentType;

    public void setPaymentType(String paymentType){
        this.paymentType=paymentType;
    }
    public String getPaymentType(){
        return paymentType;
    }

    public void payment(){
        System.out.println("cash payment is not applicable everywhere");
        try {
            if (paymentType != "UPI") {
                throw new NoUpiAvailableException("we dont have any UPI payment");
            }

            if (paymentType != "credit card") {
                throw new NoCreditCardPaymentException("we dont have credit card payment");
            }
        }catch(NoUpiAvailableException e){
            try
            {
                int a=1/0;
            System.out.println(a);
            }
            catch(ArithmeticException e1)
            {
                 System.out.println(e1.getCause());
                 System.out.println("Arithemetic exception handeled");
            }
            e.printStackTrace();
        }catch(NoCreditCardPaymentException e)
        {

            e.printStackTrace();
        }
        finally {
            System.out.println("we can go for cardless payment");
        }
        System.out.println("exception is handled");
    }
    public static void main(String[] args){
        OnlineTranscition onlineTranscition = new OnlineTranscition();
        onlineTranscition.setPaymentType("credit card");
        onlineTranscition.payment();
    }
}
