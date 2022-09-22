package edu.wctc;

import java.io.FileReader;
import java.text.Format;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your firstName: ");
        String firstname = keyboard.nextLine().toUpperCase();
        System.out.print("Please enter your LastName: ");
        String lastname = keyboard.nextLine().toUpperCase();
        System.out.print("Please enter your middleInitial: ");
        String middleinitial = keyboard.nextLine().toUpperCase();
        System.out.print("please enter your birthday year: ");
        int Year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Please enter your birth month: ");
        int Month = Integer.parseInt(keyboard.nextLine());
        System.out.print("Please enter your birth day: ");
        int Day = Integer.parseInt(keyboard.nextLine());
        System.out.print("Please enter your gender: ");
        char genderCode = keyboard.nextLine().toUpperCase().charAt(0);
        DriversLicense driversLicense= new DriversLicense();
        try {

FirstNameUtility names = new FirstNameUtility();
driversLicense.setFFF(names.encodeFirstName(firstname,middleinitial));
            LastNameUtility name = new LastNameUtility();
            driversLicense.setSSSS(name.encodeLastName(lastname));
            MonthDayGenderUtility utility = new MonthDayGenderUtility();
            driversLicense.setYY(Year);
            driversLicense.setDDD(Month);
            driversLicense.setDDD(Day);
            driversLicense.setDDD(genderCode);
        }catch (MissingNameExeception e){
          FloridaFormatter florida = new FloridaFormatter();
            WisconsinFormatter wisconsin = new WisconsinFormatter();
            System.out.println(florida);
            System.out.println(wisconsin);
            System.out.println(e.getMessage());

        }
        DriversLicenseFormatter wisconsin = new WisconsinFormatter();
       System.out.println(wisconsin.formatLicenseNumber(driversLicense));
    }
}