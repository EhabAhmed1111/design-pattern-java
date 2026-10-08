package second_example;

public class Receiver {
    private int id;
    private int money = 0;

    public Receiver(int id){
        this.id = id;
    }
    public void sendMoney(int money){
        this.money += money;
        System.out.println("Receiver " + id + " total money = " + money);
    }
}
