package edu.wctc;

import java.sql.SQLOutput;

public class MissingNameExeception extends Throwable{


        public MissingNameExeception (String nameType){

         super (nameType+ "Cannot be missing the name");

        }
}

