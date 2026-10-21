package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1;
        cellPhone1 = new CellPhone(897865111, "iPhone 16", "Verizon", "512-877-9999", "des");
        displayCellphone(cellPhone1);

        CellPhone cellPhone2;
        cellPhone2 = new CellPhone(176102927, "Galaxy", "AT&T", "512-546-4257", "Dana");
        displayCellphone(cellPhone2);

        CellPhone cellphone3;
        cellphone3 = new CellPhone(346271523, "Google Pixel", "Cricket Wireless", "737-987-0876", "Ruby");
        displayCellphone(cellphone3);


    }
    public static void displayCellphone(CellPhone phone){
        System.out.println("Hello " + phone.getPhoneOwner());
        System.out.println("Your Serial Number: " + phone.getSerialNumber());
        System.out.println("Your Cellphone Model: " + phone.getModel());
        System.out.println("Your Phone Carrier: " + phone.getCarrier());
        System.out.println("Your Phone Number: " + phone.getPhoneNumber());

    }
}
