package org.example.entities;

import org.example.constants.SecondarySubjects;

public class SecondarySchoolStudent extends Student{

    private static final String[] subjects = {
            SecondarySubjects.ADVANCED_MATHEMATICS.name(),
            SecondarySubjects.ADVANCED_SCIENCE.name(),
            SecondarySubjects.PHYSICAL_EDUCATION.name(),
            SecondarySubjects.COMPUTER_SCIENCE.name()
    };

    public SecondarySchoolStudent(){

    }

    public SecondarySchoolStudent(String nombre, String apellido, int documentNumber) {
        super(nombre, apellido, documentNumber);
    }




}
