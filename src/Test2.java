class MyThread extends  Thread {
    @Override
    public void run() {
        //thread task
        for(int i=1;i<=5;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for(int i=1;i<=100;i++) {
            System.out.println("Main Thread");
        }
    }
}
