package edu.wctc;

public class UnknownGenderCodeException extends Throwable{
    public UnknownGenderCodeException(char genderCode) {

        System.out.println("Gender code is unkown");
    }
}
