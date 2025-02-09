package LowLevelDesignQuestions.LLDATM;

public class Card {

    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private String holderName;
    static int PIN_NUMBER = 7594;
    private UserBankAccount bankAccount;

    public boolean isCorrectPINEntered(int pin){
        if(pin == PIN_NUMBER){
            return true;
        }
        return false;
    }

    public int getBankBalance(){
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount){
        bankAccount.withdrawBalance(amount);
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
