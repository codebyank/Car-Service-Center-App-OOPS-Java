package service;

import admin.Admin;
import userInput.UserInput;

import java.util.HashMap;
import java.util.Scanner;

public class AdminService {
    Admin admin;
    Service service;
    Scanner sc=new Scanner(System.in);
    HashMap<String,String> login=new HashMap<>();
    {
        login.put("Ankit","ankit@123");
        login.put("Sonu","sonu@123");
         admin=new Admin(login);
    }
     public void setLogin(String name,String password){
        if(admin.getLogin().containsKey(name)){
            if(admin.getLogin().get(name).equals(password)){
               service=new Service();
                System.out.println("Do you want to add service!y/n");
                String flag=sc.next();
                if(flag.equals("y"))
                addService();
                else{
                    System.out.println("User service dashboard!");
                    UserInput userInput=new UserInput(service);
                    userInput.inputFunction();
                }
            }
            else{
                System.out.println("Enter valid password...");
            }
        }
        else{
            System.out.println("Enter valid user...");
        }
     }

    private void addService() {
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("Enter type of vehicle...");
        String vehicle=sc.next();
        System.out.println("Enter no of service which you want to add...");
        int n=sc.nextInt();
        System.out.println("Enter serviceCode and charge...");
        for(int i=0; i<n; i++){
            String code=sc.next();
            int charge=sc.nextInt();
            map.put(code,charge);
        }
        HashMap<String,HashMap<String,Integer>> services=service.getServices();
        services.put(vehicle,map);
        service.setServices(services);
    }
}
