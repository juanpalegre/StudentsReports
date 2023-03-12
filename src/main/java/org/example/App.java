package org.example;

import org.example.constants.SecondarySubjects;
import org.example.core.DateUtilities;
import org.example.core.ReportSystemImplement;
import org.example.entities.ElementarySchoolStudent;
import org.example.entities.Report;
import org.example.entities.SecondarySchoolStudent;
import org.example.entities.Student;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Reports System");
        System.out.println("Please, indicate how many reports do you want to create: ");
        int reportsAmount = scanner.nextInt();
        System.out.println("Thanks, please complete the following instructions to create the reports");
        System.out.println("Select the Student grade to create the report: ");
        System.out.println("Press 1 for Elementary School Student");
        System.out.println("Press 2 for Secondary School Student");
        int studentType = scanner.nextInt();
        switch (studentType){
            case 1:
                for (int i = 0 ; i < reportsAmount ; i++){
                    Student studentAux = new ElementarySchoolStudent();
                    Report reportAux = new Report();
                    System.out.println("Elementary School Student Information: ");
                    System.out.println("Firstname: ");
                    studentAux.setNombre(scanner.next());
                    System.out.println("Lastname: ");
                    studentAux.setApellido(scanner.next());
                    System.out.println("Document number: ");
                    studentAux.setDocumentNumber(scanner.nextInt());
                    System.out.println("Report Information: ");
                    System.out.println("Date: ");
                    Date date = obtenerFecha();
                    System.out.println("Subject: ");
                    String subject = scanner.next();
                    System.out.println("Final Qualification: ");
                    String finalQualification = scanner.next();

                    reportAux.setStudent(studentAux);
                    reportAux.setDate(date);
                    reportAux.setSubject(subject);
                    reportAux.setFinalQualification(finalQualification);

                    ReportSystemImplement reportSystemImplement = new ReportSystemImplement();
                    reportSystemImplement.generateReport(reportAux);
                }
                break;
            case 2:
                for (int i = 0 ; i < reportsAmount ; i++){
                    Student studentAux = new SecondarySchoolStudent();
                    Report reportAux = new Report();
                    System.out.println("Secondary School Student Information: ");
                    System.out.println("Firstname: ");
                    studentAux.setNombre(scanner.next());
                    System.out.println("Lastname: ");
                    studentAux.setApellido(scanner.next());
                    System.out.println("Document number: ");
                    studentAux.setDocumentNumber(scanner.nextInt());
                    System.out.println("Report Information: ");
                    System.out.println("Date: ");
                    Date date = obtenerFecha();
                    System.out.println("Subject: ");
                    String subject = scanner.next();
                    System.out.println("Final Qualification: ");
                    String finalQualification = scanner.next();

                    reportAux.setStudent(studentAux);
                    reportAux.setDate(date);
                    reportAux.setSubject(subject);
                    reportAux.setFinalQualification(finalQualification);

                    ReportSystemImplement reportSystemImplement = new ReportSystemImplement();
                    reportSystemImplement.generateReport(reportAux);
                }
                break;
        }
    }

    private static Date obtenerFecha() {

        String userDate = "";
        Date date = null;
        while (true) {
            try {
                System.out.print("Date format [dd/mm/aaaa]: ");
                userDate = scanner.next();
                // Use the DateUtilities interface to parse the String to Date Object
                date = DateUtilities.getStringToDate(userDate);
                break;
            } catch (ParseException e) {
                System.err.println("Must insert the correct format date: " + e.getMessage());
            }
        }

        return date;
    }

}
