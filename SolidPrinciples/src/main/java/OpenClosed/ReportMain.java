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
public class ReportMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reports rs=new Reports();
 
        //Generate CSV report
        ReportingStrategy csvReportingStrategy=new CSVReport();
        rs.generateReportBasedOnStrategy(csvReportingStrategy);
 
        //Generate XML report
        ReportingStrategy xmlReportingStrategy=new XMLReport();
        rs.generateReportBasedOnStrategy(xmlReportingStrategy);
    }
    
}
