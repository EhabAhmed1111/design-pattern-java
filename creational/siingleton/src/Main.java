public class Main {

    public static void main(String[] args) {
//if (Singleton.getInstance("BBB") == Singleton.getInstance("lll")){
//    System.out.println("done");
//}

        // here each thread will try to create instance of singleton class
Thread threadFoo = new Thread(new ThreadFoo());
Thread threadBar = new Thread(new ThreadBar());
threadFoo.start();
threadBar.start();

    }
}


/* here each thread will go in same time */
class ThreadFoo extends Thread {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("FOO");
        System.out.println(singleton.value);
    }
}

class ThreadBar extends Thread {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Bar");
        System.out.println(singleton.value);
    }
}