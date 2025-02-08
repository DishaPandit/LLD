package LowLevelDesignQuestions.LLDVendingMachine.VendingState;

import LowLevelDesignQuestions.LLDVendingMachine.Coin;
import LowLevelDesignQuestions.LLDVendingMachine.Item;
import LowLevelDesignQuestions.LLDVendingMachine.VendingMachine;

import java.util.List;

public class SelectionState extends State{
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click insert coin button in selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory().getItem(codeNumber);
        int paidByUser = 0;
        for(Coin coin : machine.getCoinList()){
            paidByUser += coin.value;
        }

        if(paidByUser < item.getPrice()){
            System.out.println("Insufficient amount, product you selected is for price : " + item.getPrice() + " and you paid " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("Insufficient amount");
        }
        else if(paidByUser >= item.getPrice()){
            if(paidByUser > item.getPrice()){
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in coin dispense tray");
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot dispense product in selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount in coin dispense tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You cannot update inventory in selection state");
    }
}
