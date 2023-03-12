package org.example.core;

import org.example.entities.Report;

//This interface includes just the sign of the methods that the reports system must do.
//It is gone to be implement in the corresponding class.
public interface ReportsSystem {

    void generateReport(Report report);

    //void saveReport();

    //void readReport();

}

