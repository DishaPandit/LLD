package LowLevelDesignQuestions.LLDATM.AmountWithdrawal;

import LowLevelDesignQuestions.LLDATM.ATM;

public class CashWithdrawProcessor {

    CashWithdrawProcessor nextCashWithdrawProcessor;

    CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        this.nextCashWithdrawProcessor = cashWithdrawProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount){
        if(nextCashWithdrawProcessor != null){
            nextCashWithdrawProcessor.withdraw(atm,remainingAmount);
        }
    }
}
