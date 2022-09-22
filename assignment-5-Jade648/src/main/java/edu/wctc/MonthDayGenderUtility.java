package edu.wctc;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int Year, int Month, int Day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {
if(genderCode!= CODE_MALE && genderCode != CODE_FEMALE){
    throw new UnknownGenderCodeException(genderCode);
}
try{
    LocalDate date = LocalDate.of(Year,Month,Day);

}catch (DateTimeException e){
    throw new InvalidBirthdayException();
    }

return (Month-1)*40+Day+ genderCode == CODE_MALE ? MOD_MALE: MOD_FEMALE;
    }
}
