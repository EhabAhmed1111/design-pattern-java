package second_example;

public class Main {
    /*
    * */

//    Sender sender =  new Sender();

    static void main() {

        Receiver receiver  = new Receiver(1);
        SendMoneyCommand sendMoneyCommand = new SendMoneyCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.execute(sendMoneyCommand);

    }

}
