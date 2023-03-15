package org.example.entities;

import org.example.constants.SecondarySubjects;

import javax.security.auth.Subject;
import java.util.ArrayList;

public class SecondarySchoolStudent extends Student{

    private final ArrayList<SecondarySubjects> subjectList = new ArrayList<>();

    public SecondarySchoolStudent(){

    }

    public SecondarySchoolStudent(String nombre, String apellido, int documentNumber) {
        super(nombre, apellido, documentNumber);
    }

    public ArrayList<SecondarySubjects> getSubjectList(){
        return subjectList;
    }


}
