package org.example.core;

import org.example.entities.Report;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ReportSystemImplement implements ReportsSystem{

    public void generateReport(Report report){
        //This method get a Report and uses it´s attributes to generate an extract a file with the Student Report
        String fileName = report.getStudent().getApellido() + ".txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("First name of student: " + report.getStudent().getNombre() + "\n");
            bufferedWriter.write("Last name of student: " + report.getStudent().getApellido() + "\n");
            bufferedWriter.write("Subject: " + report.getSubject() + "\n");
            bufferedWriter.write("Date: " + report.getDate() + "\n");
            bufferedWriter.write("Final qualification: " + report.getFinalQualification() + "\n");

            bufferedWriter.close();

            System.out.println("Report " + fileName + " successfully created");
        }catch (IOException e){
            System.out.println("Sory. There was an error during the creation of the report");
            e.printStackTrace();
        }
    }

}
