//create a second thread by extending thread
public class NewThread extends Thread {

    Thread t;

    NewThread(){
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    //This is the entry point for second thread.
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted!");
        }
        System.out.println("Exiting child thread.");
    }
}
