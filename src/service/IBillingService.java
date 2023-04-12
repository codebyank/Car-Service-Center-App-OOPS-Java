package service;

import java.util.HashMap;

public interface IBillingService {
    void printAllServices(HashMap<String,Integer> prices);
    void generateBill(String name,HashMap<String,Integer> prices);
}
