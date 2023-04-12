package userInput;

import service.BillingService;
import service.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInput {

    Service service;
    Scanner sc;

    public UserInput(Service service) {

        this.service = service;
        sc = new Scanner(System.in);
    }

    public void inputFunction() {
        System.out.println("Enter your vehicle type...");
        String vehicle = sc.next().toLowerCase();
        //System.out.println("Type of vehicle is : "+vehicle);
        BillingService billingService = new BillingService();
        if (!service.getServices().containsKey(vehicle)) {
            System.out.println("Not available services for this vehicle!");
            return;
        }
        printAllServices(service.getServices().get(vehicle));
        billingService.generateBill(vehicle,service.getServices().get(vehicle));

    }
    public void printAllServices(HashMap<String,Integer> prices){
        // System.out.println(prices);


        System.out.println("Available services !");
        // System.out.println("Service\t\t\t code  charge");
        for(Map.Entry<String,Integer>val: prices.entrySet()){
            String s= val.getKey();
            switch (s) {
                case "BS01": {
                    System.out.println("Basic servicing\t" + "BS01\t" + val.getValue()+"Rs.");
                    break;
                }
                case "EF01": {
                    System.out.println("Engine fixing\t" + "EF01\t" + val.getValue()+"Rs.");
                    break;
                }
                case "BF01": {
                    System.out.println("Break fixing\t" + "BF01\t" + val.getValue()+"Rs.");
                    break;
                }
                case "GF01": {
                    System.out.println("Gear fixing\t" + "GF01\t" + val.getValue()+"Rs.");
                    break;
                }
                case "CF01": {
                    System.out.println("Clutch fixing\t" + "CF01\t" + val.getValue()+"Rs.");
                    break;
                }
                default:{
                    System.out.println("General Servicing\t" + s+"\t" + val.getValue()+"Rs.");
                    break;
                }

            }
        }
    }
}

