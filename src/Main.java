
public class Main  {

    public static MyFrame frame1;
    MyFrame frame2;


    public Main() {
        Thread t1 = new Thread() {
            public void run() {
                frame1 = new MyFrame(1);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                 frame2 = new MyFrame(10);
            }
        };

        t1.start();
        t2.start();

    }


    public static void main (String[] args){

       new Main();
    }
}

