package moneytracker.command;

import moneytracker.exception.MoneyTrackerException;
import moneytracker.storage.Storage;
import moneytracker.transaction.TransactionList;
import moneytracker.ui.Ui;

public class ClearCommand extends Command {
    @Override
    public void execute(TransactionList transactions, Ui ui, Storage storage) throws MoneyTrackerException {

    }
}