package userInput;

import service.BillingService;
import service.Service;

import java.util.HashMap;
import java.util.Scanner;

public class UserInput {
      HashMap<String,Integer> services;
      Service service;
      Scanner sc;
    public UserInput( Service service) {
        this.services = new HashMap<>();
        this.service = service;
        sc=new Scanner(System.in);
    }

    public void inputFunction() {
       System.out.println("Enter your vehicle type...");
        String vehicle=sc.next().toLowerCase();
        //System.out.println("Type of vehicle is : "+vehicle);
        BillingService billingService=new BillingService();
        if(!service.getServices().containsKey(vehicle)){
            System.out.println("Not available services for this vehicle!");
            return;
        }
        billingService.generateBill(vehicle,service.getServices().get(vehicle));
    }
}
