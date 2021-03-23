/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInversion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NewUser
 */
public class DependencyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Carro> contaCarro = new ArrayList<>();
        contaCarro.add(new Nissan());
        contaCarro.add(new Toyota());
        
        contaCarro.forEach((em) -> {
            em.manejar();
        });
        System.out.println(contaCarro.size());
        
    }
    
}
