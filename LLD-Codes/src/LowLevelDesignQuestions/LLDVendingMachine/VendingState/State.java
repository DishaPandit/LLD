package LowLevelDesignQuestions.LLDVendingMachine.VendingState;

import LowLevelDesignQuestions.LLDVendingMachine.Coin;
import LowLevelDesignQuestions.LLDVendingMachine.Item;
import LowLevelDesignQuestions.LLDVendingMachine.VendingMachine;

import java.util.List;

public abstract class State {

    public abstract void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public abstract void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public abstract void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public abstract void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public abstract int getChange(int returnChangeMoney) throws Exception;

    public abstract Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public abstract List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public abstract void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;


}
