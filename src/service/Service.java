package service;

import java.util.HashMap;

public class Service {
        private HashMap<String, HashMap<String, Integer>> services; // Type of Car -> Service Code -> Price

        public Service() {
            this.services = new HashMap<>();
            // Adding prices for each type of car and service
            HashMap<String, Integer> hatchback = new HashMap<>();
            hatchback.put("BS01", 2000);
            hatchback.put("EF01", 5000);
            hatchback.put("CF01", 2000);
            hatchback.put("BF01", 1000);
            hatchback.put("GF01", 3000);
            this.services.put("hatchback", hatchback);

            HashMap<String, Integer> sedan = new HashMap<>();
            sedan.put("BS01", 4000);
            sedan.put("EF01", 8000);
            sedan.put("CF01", 4000);
            sedan.put("BF01", 1500);
            sedan.put("GF01", 6000);
            this.services.put("sedan", sedan);

            HashMap<String, Integer> suv = new HashMap<>();
            suv.put("BS01", 5000);
            suv.put("EF01", 10000);
            suv.put("CF01", 6000);
            suv.put("BF01", 2500);
            suv.put("GF01", 8000);
            this.services.put("suv", suv);

        }

        // Method to get the price of a particular service for a given type of car and service code


    public HashMap<String, HashMap<String, Integer>> getServices() {
        return services;
    }

    public void setServices(HashMap<String, HashMap<String, Integer>> services) {
        this.services = services;
    }
}


