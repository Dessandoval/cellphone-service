package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phoneData;
        phoneData = new CellPhone(111, "iphone", "verizon", "512-877-9999", "des");


        System.out.println("Hello " + phoneData.getPhoneOwner());
        System.out.println("Your Serial Number is: " + phoneData.getSerialNumber());
        System.out.println("Your Cellphone Model is: " + phoneData.getModel());
        System.out.println("Your Phone Carrier is: " + phoneData.getCarrier());
        System.out.println("Your Phone Number is: " + phoneData.getPhoneNumber());



    }
}
