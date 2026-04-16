package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //create the phone
        CellPhone thePhone = new CellPhone();

        //start gathering information for the phone
        System.out.print("What is the serial number? ");
        //store the serial from the user
        int serialNumber = theScanner.nextInt();

        //add the serialNumber to the actual phone
        thePhone.setSerialNumber(serialNumber);

        //eat the newline since we are switching to asking text
        theScanner.nextLine();


        System.out.print("What model is this phone? ");
        String model = theScanner.nextLine();

        //add the model to the phone
        thePhone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = theScanner.nextLine();

        //add the carrier to the phone
        thePhone.setCarrier(carrier);

        System.out.print("What is the number? ");
        String phoneNumber = theScanner.nextLine();

        //add the number to the phone
        thePhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner? ");
        String owner = theScanner.nextLine();

        //add the owner to the phone
        thePhone.setOwner(owner);

        //display the result
        System.out.println(thePhone.toString());




    }

}
