package filehandling;

import model.Bill;
import java.util.*;

public class BillFileHandler extends FileManager {

    public BillFileHandler(String filePath) {
        super(filePath);
    }

    public void saveBill(Bill bill) {}

    public List<Bill> loadBills() {
        return null;
    }
}