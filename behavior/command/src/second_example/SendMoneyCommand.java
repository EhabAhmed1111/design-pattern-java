package second_example;

public class SendMoneyCommand implements Command{
    private Receiver receiver;

    public SendMoneyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sendMoney(500);
    }
}
