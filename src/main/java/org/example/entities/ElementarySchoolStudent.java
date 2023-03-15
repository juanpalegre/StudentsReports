package org.example.entities;

import org.example.constants.ElementarySubjects;

import java.util.ArrayList;

public class ElementarySchoolStudent extends Student{

    private final ArrayList<ElementarySubjects> subjectList = new ArrayList<>();

    public ElementarySchoolStudent(){

    }

    public ElementarySchoolStudent(String nombre, String apellido, int documentNumber) {
        super(nombre, apellido, documentNumber);
    }

    public ArrayList<ElementarySubjects> getSubjectList(){
        return subjectList;
    }
}
