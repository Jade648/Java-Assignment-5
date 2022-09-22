package edu.wctc;

import java.time.Year;

public class InvalidBirthdayException extends Throwable {

    private int birthYear = 0;
private int birthMonthDayGender = 0;

    public void DriversLicense(int birthMonthDayGender) {
        DriversLicense(birthYear,
                birthMonthDayGender);
    }

    private void DriversLicense(int birthYear, int birthMonthDayGender) {
            this.birthYear = birthYear;
            this.birthMonthDayGender = birthMonthDayGender;
            System.out.println("That is an invalid birth year month and day");
    }
    }
