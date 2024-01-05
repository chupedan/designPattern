package behavioral.chain_of_responsibility.cb1;


public class Main {
    public static void main(String[] args) {
        IMoneyHandler money500=new MoneyHandler(500);
        IMoneyHandler money100=new MoneyHandler(100);
        IMoneyHandler money50=new MoneyHandler(50);
        IMoneyHandler money10=new MoneyHandler(10);
        IMoneyHandler money1=new MoneyHandler1(1);
        money500.capCaoHon(money100).capCaoHon(money50).capCaoHon(money10).capCaoHon(money1);
        money500.handleMoney(293,500);
        //money500.handleMoney(293,50);
    }
}
