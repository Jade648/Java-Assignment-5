package edu.wctc;


public class WisconsinFormatter implements DriversLicenseFormatter{
    @Override
    public  String formatLicenseNumber(DriversLicense driversLicense){

        return String.format("%s-%s-%s-%s-%s",driversLicense.getSSSS(),driversLicense.getFFF(),driversLicense.getYY(),driversLicense.getYY(),driversLicense.getDDD(),driversLicense.getNN());
}
}
