package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1;
        cellPhone1 = new CellPhone(111, "iphone", "verizon", "512-877-9999", "des");
        displayCellphone(cellPhone1);

        CellPhone cellPhone2;
        cellPhone2 = new CellPhone(11029273, "Galaxy", "AT&T", "512-546-4257", "Dana");
        displayCellphone(cellPhone2);


    }
    public static void displayCellphone(CellPhone phone){
        System.out.println("Hello " + phone.getPhoneOwner());
        System.out.println("Your Serial Number is: " + phone.getSerialNumber());
        System.out.println("Your Cellphone Model is: " + phone.getModel());
        System.out.println("Your Phone Carrier is: " + phone.getCarrier());
        System.out.println("Your Phone Number is: " + phone.getPhoneNumber());

    }
}
