package service;

import java.util.HashMap;

public interface IBillingService {
    void generateBill(String name,HashMap<String,Integer> prices);
}
