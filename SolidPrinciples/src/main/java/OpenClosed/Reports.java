/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosed;

/**
 *
 * @author NewUser
 */
public class Reports {
    
    public void generateReportBasedOnStrategy(ReportingStrategy reportingStrategy)
    {
        System.out.println("===================================");
        System.out.println("Generating report based on Strategy");
        System.out.println("===================================");
 
        reportingStrategy.generateReport();
        System.out.println();
    }
}
