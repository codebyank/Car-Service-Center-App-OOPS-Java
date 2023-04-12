package service;

import java.util.*;

public class BillingService implements IBillingService{
   Scanner sc;
   int charge;

    public BillingService() {
        this.sc = new Scanner(System.in);
        this.charge =0;
    }

    @Override
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


    public void generateBill(String name,HashMap<String,Integer> prices){
        printAllServices(prices);
        System.out.println("Enter no of service you want...");
        int n=sc.nextInt();
        System.out.println("Enter service_code...");
       List<String> serviceList=new ArrayList<>();
        for(int i=0; i<n; i++) {
            String s = sc.next();
            serviceList.add(s);
        }
        System.out.println("Type of car : "+name);
        for(String s:serviceList){
            s=s.toUpperCase();
            switch (s) {
                case "BS01":
                {
                    System.out.println("Charge for basic servicing is : " + prices.get(s)+"Rs.");
                    break;
                }
                case "EF01":
                {
                    System.out.println("Charge for engine fixing is : " + prices.get(s)+"Rs.");
                    break;
                }
                case "GF01":
                {
                    System.out.println("Charge for gear fixing is : " + prices.get(s)+"Rs.");
                    break;
                }
                case "BF01":
                {
                    System.out.println("Charge for brake fixing is : " + prices.get(s)+"Rs.");
                    break;
                }
                case "CF01":
                {
                    System.out.println("Charge for clutch fixing is : " + prices.get(s)+"Rs.");
                    break;
                }
                default:{
                    System.out.println("Charge for general servicing is : " + prices.get(s)+"Rs.");
                    break;
                }

            }
            charge+=prices.get(s);
        }

        System.out.println("Total bill = "+charge+"Rs.");
        if(charge>10000){
            System.out.println("Complementry washing service is provided!");
        }
    }
}

