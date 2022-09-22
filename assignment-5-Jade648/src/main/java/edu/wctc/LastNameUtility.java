package edu.wctc;


import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private Soundex soundex = new Soundex();

    public String encodeLastName(String LastName) throws MissingNameExeception {
        if ( LastName == null) {
            throw new MissingNameExeception("LastName");

        }

        return soundex.encode(LastName);
    }
}
