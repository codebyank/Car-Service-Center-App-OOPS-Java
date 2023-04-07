import service.AdminService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to car billing service Dashboard!");
        Scanner sc=new Scanner(System.in);
        AdminService adminService=new AdminService();
        System.out.println("Please login");
        System.out.println("Enter name...");
          String name=sc.next();
        System.out.println("Enter password...");
        String password=sc.next();
        adminService.setLogin(name,password);

    }
}