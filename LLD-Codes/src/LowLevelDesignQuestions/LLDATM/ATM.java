package LowLevelDesignQuestions.LLDATM;

import LowLevelDesignQuestions.LLDATM.ATMStates.ATMState;
import LowLevelDesignQuestions.LLDATM.ATMStates.IdleState;

public class ATM {

    private static ATM atmObject = new ATM();   //singleton : eager initialization

    ATMState currentATMState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM(){

    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public static ATM getAtmobject(){
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2000 Notes: " + noOfTwoThousandNotes);
        System.out.println("500 Notes: " + noOfFiveHundredNotes);
        System.out.println("100 Notes: " + noOfOneHundredNotes);
    }
}
