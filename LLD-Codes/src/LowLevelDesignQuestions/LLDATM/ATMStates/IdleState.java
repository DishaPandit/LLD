package LowLevelDesignQuestions.LLDATM.ATMStates;

import LowLevelDesignQuestions.LLDATM.ATM;
import LowLevelDesignQuestions.LLDATM.Card;

public class IdleState extends ATMState{

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
