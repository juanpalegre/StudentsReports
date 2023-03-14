package org.example.constants;

public enum SecondarySubjects {

    ADVANCED_MATHEMATICS("Advanced Mathematics"),
    ADVANCED_SCIENCE("Advancaed Science"),
    COMPUTER_SCIENCE("Computer Sciennce"),
    PHYSICAL_EDUCATION("Physical Education");

    private final String SUBJECT_NAME;

    SecondarySubjects(String SUBJECT_NAME){
        this.SUBJECT_NAME = SUBJECT_NAME;
    }

    public String getSUBJECT_NAME(){
        return SUBJECT_NAME;
    }
}
