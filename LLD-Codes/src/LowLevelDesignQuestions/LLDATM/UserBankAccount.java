package LowLevelDesignQuestions.LLDATM;

public class UserBankAccount {

    int balance;

    public void withdrawBalance(int amount){
        balance = balance - amount;
    }
}
