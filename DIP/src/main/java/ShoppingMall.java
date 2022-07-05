public class ShoppingMall {

    public BankCard bankCard;

    public ShoppingMall (BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }


    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPayment("Some purchase",4000);
    }

}
