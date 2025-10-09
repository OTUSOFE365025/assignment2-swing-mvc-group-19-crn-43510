import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class CashRegister {
    private Map<String, Product> inventory = new HashMap<>();
    private List<Product> transactionLog = new ArrayList<>();

    public CashRegister(String dataFilePath) {
        initializeInventory(dataFilePath);
    }

    private void initializeInventory(String dataFilePath) {
        try (java.util.Scanner dataScanner = new java.util.Scanner(new File(dataFilePath))) {
            while (dataScanner.hasNext()) {

                String productCode = dataScanner.next();
                String productName = dataScanner.next();
                double unitPrice = dataScanner.nextDouble();

                inventory.put(productCode, new Product(productCode, productName, unitPrice));
            }
        } catch (Exception e) {
            System.out.println("Error reading product file: " + e.getMessage());
        }
    }

    public void addItemByUPC(String productCode) {
        if (inventory.containsKey(productCode)) {
            transactionLog.add(inventory.get(productCode));
        }
    }

    // Renamed 'scannedItems' to 'transactionLog'
    public List<Product> getScannedItems() {
        return transactionLog;
    }

    public double getSubtotal() {
        double transactionTotal = 0.0;
        for (Product item : transactionLog) {
            transactionTotal += item.getPrice();
        }
        return transactionTotal;
    }

    public List<String> getAllUPCCodes() {
        return new ArrayList<>(inventory.keySet());
    }
}