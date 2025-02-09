package LowLevelDesignQuestions.LLDATM.ATMStates;

import LowLevelDesignQuestions.LLDATM.ATM;
import LowLevelDesignQuestions.LLDATM.Card;

public class CheckBalanceState extends ATMState{
    public CheckBalanceState() {
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("Your Balance is: " + card.getBankBalance());
        exit(atm);
    }

    public void exit(ATM atmObject){
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    public void returnCard(){
        System.out.println("Please collect your card");
    }

}
