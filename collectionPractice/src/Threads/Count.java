package Threads;

public class Count implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++) {
            System.out.println("Number - "+i+ "  in " + Thread.currentThread().getName() + " thread ") ;
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Count count=new Count();
        count.run();
        Thread thread=new Thread(count);
        thread.start();

//        for(int i=0;i<20;i++) {
//            System.out.println("Number - "+i+ "  in " + Thread.currentThread().getName() + " thread ") ;
//        }



    }
}
