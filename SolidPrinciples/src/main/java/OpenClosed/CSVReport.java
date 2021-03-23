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
public class CSVReport implements ReportingStrategy{

    @Override
    public void generateReport() {
        System.out.println("Generate CSV Report");
    }
    
}
