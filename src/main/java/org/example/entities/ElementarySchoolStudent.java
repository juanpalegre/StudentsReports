package org.example.entities;

import org.example.constants.ElementarySubjects;
import org.example.constants.SecondarySubjects;

public class ElementarySchoolStudent extends Student{

    private static final String[] subjects = {
            ElementarySubjects.MATHEMATICS.name(),
            ElementarySubjects.SOCIAL_STUDIES.name(),
            ElementarySubjects.SCIENCE.name(),
            ElementarySubjects.ENGLISH.name()
    };

    public ElementarySchoolStudent(){

    }

    public ElementarySchoolStudent(String nombre, String apellido, int documentNumber) {
        super(nombre, apellido, documentNumber);
    }


}
