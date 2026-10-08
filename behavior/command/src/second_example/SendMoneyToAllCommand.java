package second_example;

import java.util.ArrayList;
import java.util.List;

public class SendMoneyToAllCommand implements Command{
    private List<Receiver> receivers;

    public SendMoneyToAllCommand(List<Receiver> receiver){
        this.receivers = receiver;
    }

    @Override
    public void execute() {
        receivers.forEach(receiver->receiver.sendMoney(500));
    }
}
