package org.example.entities;

import java.util.Date;

//This class represent the model of the students reports
public class Report {

    private Student student;
    private String subject;
    private Date date;
    private String finalQualification;

    public Report(){

    }
    public Report(Student student, String subject, Date date, String finalQualification) {
        this.student = student;
        this.subject = subject;
        this.date = date;
        this.finalQualification = finalQualification;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFinalQualification() {
        return finalQualification;
    }

    public void setFinalQualification(String finalQualification) {
        this.finalQualification = finalQualification;
    }
}
