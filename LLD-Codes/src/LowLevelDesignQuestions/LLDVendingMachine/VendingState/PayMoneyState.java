package LowLevelDesignQuestions.LLDVendingMachine.VendingState;

import LowLevelDesignQuestions.LLDVendingMachine.Coin;
import LowLevelDesignQuestions.LLDVendingMachine.Item;
import LowLevelDesignQuestions.LLDVendingMachine.VendingMachine;

import java.util.List;

public class PayMoneyState extends State{
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot choose product in pay money state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You cannot get change in pay money state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot dispense product in pay money state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount in cash dispense tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You cannot update inventory in pay money state");
    }
}
