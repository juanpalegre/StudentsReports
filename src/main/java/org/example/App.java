package org.example;

import org.example.constants.ElementarySubjects;
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
        //An instance of the scanner class allows us to interact with the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Reports System");
        System.out.println("Please, indicate how many reports do you want to create: ");

        //Take the number of reports that the user want to create and save it in a variable
        int reportsAmount = scanner.nextInt();
        System.out.println("Thanks, please complete the following instructions to create the reports");
        System.out.println("Select the Student grade to create the report: ");

        //Let the user select the type of student, if we add more types in the future
        //we just need to add there logic to the switch structure
        System.out.println("Press 1 for Elementary School Student");
        System.out.println("Press 2 for Secondary School Student");
        int studentType = scanner.nextInt();
        switch (studentType){
            case 1:
                for (int i = 0 ; i < reportsAmount ; i++){
                    //Logic for the elementary student
                    //We use two aux instance, then it will use the data enter by the user
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
                    //Call the getDate function, so we can parse the String data to Date type
                    Date date = getDate();
                    System.out.println("Subject: ");
                    String subject = selectSubject(studentAux);
                    System.out.println("Final Qualification: ");
                    String finalQualification = scanner.next();

                    reportAux.setStudent(studentAux);
                    reportAux.setDate(date);
                    reportAux.setSubject(subject);
                    reportAux.setFinalQualification(finalQualification);

                    ReportSystemImplement reportSystemImplement = new ReportSystemImplement();

                    //When we have all the data that we need, we call the generateReport function from the ReportSystem
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
                    Date date = getDate();
                    System.out.println("Subject: ");
                    String subject = selectSubject(studentAux);
                    System.out.println("Final Qualification: ");
                    String finalQualification = scanner.next();

                    reportAux.setStudent(studentAux);
                    reportAux.setDate(date);
                    reportAux.setSubject(subject);
                    reportAux.setFinalQualification(finalQualification);

                    ReportSystemImplement reportSystemImplement = new ReportSystemImplement();

                    //When we have all the data that we need, we call the generateReport function from the ReportSystem
                    reportSystemImplement.generateReport(reportAux);
                }
                break;
        }
        //Close the scanner
        scanner.close();
    }

    private static Date getDate() {

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

    private static String selectSubject(Student student){
        String subject = "Subject";
        if (student instanceof ElementarySchoolStudent){
            System.out.println("Please, select the subject of the report: ");
            System.out.println(ElementarySubjects.MATHEMATICS + "Press 1");
            System.out.println(ElementarySubjects.SOCIAL_STUDIES + "Press 2");
            System.out.println(ElementarySubjects.ENGLISH + "Press 3");
            System.out.println(ElementarySubjects.SCIENCE + "Press 4");
            byte selection = scanner.nextByte();
            switch (selection){
                case 1:
                    subject = ElementarySubjects.MATHEMATICS.name();
                    break;
                case 2:
                    subject = ElementarySubjects.SOCIAL_STUDIES.name();
                    break;
                case 3:
                    subject = ElementarySubjects.ENGLISH.name();
                    break;
                case 4:
                    subject = ElementarySubjects.SCIENCE.name();
                    break;
            }
        }else if (student instanceof SecondarySchoolStudent){
            System.out.println("Please, select the subject of the report: ");
            System.out.println(SecondarySubjects.ADVANCED_MATHEMATICS + "Press 1");
            System.out.println(SecondarySubjects.ADVANCED_SCIENCE + "Press 2");
            System.out.println(SecondarySubjects.COMPUTER_SCIENCE + "Press 3");
            System.out.println(SecondarySubjects.PHYSICAL_EDUCATION + "Press 4");
            byte selection = scanner.nextByte();
            switch (selection){
                case 1:
                    subject = SecondarySubjects.ADVANCED_MATHEMATICS.getSUBJECT_NAME();
                break;
                case 2:
                    subject = SecondarySubjects.ADVANCED_SCIENCE.getSUBJECT_NAME();
                break;
                case 3:
                    subject = SecondarySubjects.COMPUTER_SCIENCE.getSUBJECT_NAME();
                break;
                case 4:
                    subject = SecondarySubjects.PHYSICAL_EDUCATION.getSUBJECT_NAME();
                break;
            }
        }
        return subject;
    }

}
